package com.softwire.training.tickets.services;

import com.softwire.training.tickets.model.database.Ticket;
import org.jdbi.v3.core.Jdbi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {

    private final Jdbi jdbi;

    @Autowired
    public TicketService(Jdbi jdbi) {
        this.jdbi = jdbi;
    }

    public void createTicket(Ticket ticket) {

        jdbi.useHandle(handle ->
                handle.createUpdate("INSERT INTO tickets (name, description) VALUES (:name, :description)")
                        .bindBean(ticket)
                        .execute()
        );
    }

    public List<Ticket> getAllTickets() {

        return jdbi.withHandle(handle -> handle.createQuery("SELECT * FROM tickets WHERE resolved = false")
                .mapToBean(Ticket.class)
                .list());
    }

    public void markTicketAsResolved(int ticketId) {

        jdbi.useHandle(handle -> handle.createUpdate("UPDATE tickets SET resolved = true WHERE id = :id")
                .bind("id", ticketId)
                .execute());
    }

}
