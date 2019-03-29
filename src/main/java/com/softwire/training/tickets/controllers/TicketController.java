package com.softwire.training.tickets.controllers;

import com.softwire.training.tickets.model.Ticket;
import com.softwire.training.tickets.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class TicketController {

    private final TicketService ticketService;

    @Autowired
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @RequestMapping("/")
    ModelAndView index() {
        return new ModelAndView("index");
    }

    @RequestMapping("/create")
    ModelAndView create() {
        return new ModelAndView("create");
    }

    @RequestMapping("/create-ticket")
    RedirectView createTicket (@ModelAttribute Ticket ticket) {

        ticketService.createTicket(ticket);

        return new RedirectView("/argos-waiting-area");
    }

    @RequestMapping("/argos-waiting-area")
    ModelAndView argosWaitingArea () {

        return new ModelAndView("/argos-waiting-area");
    }

}
