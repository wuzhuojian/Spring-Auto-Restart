package com.autorestart.livereload;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/")
    public String handleRequest(Model model) {
        model.addAttribute("msg", "This is a test");
        return "This is my home";
    }
}
