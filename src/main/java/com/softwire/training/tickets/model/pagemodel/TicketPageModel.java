package com.softwire.training.tickets.model.pagemodel;

import com.softwire.training.tickets.model.database.Ticket;

import java.util.List;

public class TicketPageModel {

    private List<Ticket> tickets;
    private Ticket ticket;

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
