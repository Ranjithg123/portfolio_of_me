package com.example.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "Ranjith Kumar G");
        model.addAttribute("skills", new String[]{"Java", "Spring Boot", "HTML", "CSS"});
        return "index";
    }
}
