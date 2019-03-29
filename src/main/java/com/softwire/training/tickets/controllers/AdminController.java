package com.softwire.training.tickets.controllers;

import com.softwire.training.tickets.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AdminController {

    private final String adminPassword;
    private final TicketService ticketService;

    @Autowired
    public AdminController(TicketService ticketService, @Value("${admin.password}") String adminPassword) {
        this.ticketService = ticketService;
        this.adminPassword = adminPassword;
    }

    @RequestMapping("/resolve-ticket")
    public RedirectView resolveTicket(@ModelAttribute ResolveTicketData resolveTicketData) {
        if (resolveTicketData.getPassword().equals(adminPassword)) {
            ticketService.markTicketAsResolved(resolveTicketData.getId());
        }
        return new RedirectView("/argos-waiting-area");
    }

    private static class ResolveTicketData {
        private Integer id;
        private String password;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
}
