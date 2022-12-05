package com.example.lastdockertest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SubController {
    @GetMapping(value = "/view")
    public String home(String id, String password, Model model)
    {
        model.addAttribute("title","Sign In");
        return "sign";
    }
}
