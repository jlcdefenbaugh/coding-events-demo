package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

//    private static List<String> events = new ArrayList<>();


    @GetMapping
    public String displayAllEvents(Model model) {
//        model.addAttribute("events", events);
//        return "events/index";

        HashMap<String, String> events = new HashMap<>();
        events.put("Code. Now Code Again", "When one round of coding just isn't enough!");
        events.put("Tired and Coding", "For pretend coders with day jobs!");
        events.put("Eat...and Also Code", "For people who eat first, code second!");

        model.addAttribute("events", events);
        return "events/index";
    }

    //lives at events/create
    @GetMapping("create")
    public String renderCreateEventForm() {
        return "events/create";
    }

    //also lives at events/create - this okay because it is post request, not get...otherwise could not do this
//    @PostMapping("create")
//    public String createEvent(@RequestParam String eventName) {
////        events.add(eventName);
////        return "redirect:"; //redirects to root path once added?
//    }
}
