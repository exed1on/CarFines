package com.example.lastdockertest.controllers;

import com.example.lastdockertest.models.User;
import com.example.lastdockertest.repo.SignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DemoController {
    @Autowired
    private SignRepository signRepository;

    @GetMapping(value = "/sign")
    public String home(Model model)
    {
        System.out.println(signRepository.count());
        Iterable<User> users=signRepository.findAll();

        model.addAttribute("users",users);
        //System.out.println(users.toString());
        model.addAttribute("user", new User());
        return "sign";
    }
    @PostMapping("/sign")
    public String submitForm(@ModelAttribute("user") User user) {
        System.out.println(user);
        return "sign_success";
    }
//    @GetMapping("/view/{id}")
//    public String insert(@PathVariable("id") String id,
//                       @RequestParam("password") String password)
//    {
//        System.out.println(id);
//        System.out.println(password);
//        return ("Hello, "+id+", you are "+ password +", so you are old enough to visit this page");
//    }
}
