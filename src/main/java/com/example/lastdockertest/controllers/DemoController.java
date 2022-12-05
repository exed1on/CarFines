package com.example.lastdockertest.controllers;

import com.example.lastdockertest.classes.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DemoController {
    @GetMapping(value = "/sign")
    public String home(Model model)
    {
        model.addAttribute("user", new User());
        model.addAttribute("title","Sign In");
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
