package com.softwire.training.tickets.controllers;

import com.softwire.training.tickets.services.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Controller
public class SampleController {

    private final SampleService sampleService;

    @Autowired
    public SampleController(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @RequestMapping("/")
    ModelAndView index() {
        return new ModelAndView("index");
    }

    @RequestMapping("/db")
    ModelAndView db() {
        List<Timestamp> timestamps = sampleService.sample();
        List<String> output = new ArrayList<>();
        for (Timestamp ts : timestamps) {
            output.add("Read from DB: " + ts);
        }
        return new ModelAndView("db", "records", output);
    }
}
