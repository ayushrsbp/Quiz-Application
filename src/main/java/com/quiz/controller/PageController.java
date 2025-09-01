package com.quiz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/home")
    public String home() {
        return "home";
    }

    @RequestMapping("/loginUser")
    public String login() {
        return "login";
    }

    @RequestMapping("/registerUser")
    public String register() {
        return "registeration";
    }
}
