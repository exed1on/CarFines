package com.example.lastdockertest.controllers;

import com.example.lastdockertest.models.User;
import com.example.lastdockertest.repo.SignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ListController {
    @Autowired
    private SignRepository signRepository;
    @GetMapping(value = "/fines")
    public String home(Model model)
    {
        Iterable<User> users=signRepository.findAll();

        model.addAttribute("users",users);
        //System.out.println(users.toString());
        model.addAttribute("user", new User());
        return "fines";
    }
}
