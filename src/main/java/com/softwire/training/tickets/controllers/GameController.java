package com.softwire.training.tickets.controllers;

import com.softwire.training.tickets.model.database.Ticket;
import com.softwire.training.tickets.model.pagemodel.TicketPageModel;
import com.softwire.training.tickets.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;


@Controller
@RequestMapping("/game")
public class GameController {


    @Autowired
    public GameController() { }

    @RequestMapping("/dvd")
    ModelAndView dvd() {
        return new ModelAndView("games/dvd");
    }

    @RequestMapping("/dino")
    ModelAndView dino() {
        return new ModelAndView("games/dino");
    }

    @RequestMapping("/mario")
    ModelAndView mario () {
        return new ModelAndView("games/mario");
    }

    @RequestMapping("/pacman")
    ModelAndView pacman () {
        return new ModelAndView("games/pacman");
    }

    @RequestMapping("/tetris")
    ModelAndView tetris () {
        return new ModelAndView("games/tetris");
    }

    @RequestMapping("/snake")
    ModelAndView snake () {
        return new ModelAndView("games/snake");
    }


}
