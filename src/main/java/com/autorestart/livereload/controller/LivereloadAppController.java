package com.autorestart.livereload.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LivereloadAppController {

    @RequestMapping("/")
    public String handleRequest(Model model) {
        model.addAttribute("msg", "This is a test");
        return "home";
    }
}
