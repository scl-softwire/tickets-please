package com.softwire.training.tickets.services;

import com.softwire.training.tickets.model.Ticket;
import org.jdbi.v3.core.Jdbi;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TicketService {

    private final Jdbi jdbi;

    @Autowired
    public TicketService(Jdbi jdbi) {
        this.jdbi = jdbi;
    }

    public void createTicket() {
        return jdbi.withHandle(handle -> {

        });
    }

    public List<Ticket> getAllTickets() {
        jdbi.withHandle(handle -> {

        });
    }

    public void deleteTicket(int ticketId) {

        jdbi.withHandle(handle -> {

        });
    }

}
