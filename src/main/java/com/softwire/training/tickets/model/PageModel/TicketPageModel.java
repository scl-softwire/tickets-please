package com.softwire.training.tickets.model.PageModel;

import com.softwire.training.tickets.model.DataBase.Ticket;

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
