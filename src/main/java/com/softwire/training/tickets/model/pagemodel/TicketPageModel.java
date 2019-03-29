package com.softwire.training.tickets.model.pagemodel;

import com.softwire.training.tickets.model.database.Ticket;

import java.util.List;

public class TicketPageModel {

    private List<Ticket> tickets;

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }
}
