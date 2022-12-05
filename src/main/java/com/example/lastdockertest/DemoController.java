package com.example.lastdockertest;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class DemoController {
public DemoController() {
        names.add(1);
        names.add(2);
    }

    @GetMapping(value = "/hello")
    public String getHello()
    {
        return "Hello world and docker!";
    }
    @GetMapping(value = "/menu")
    public String getMenu()
    {
        return "Here you can choose ";
    }
    ArrayList<Integer> names = new ArrayList<>();

    @GetMapping("/hello/{id}")
    public String insert(@PathVariable("id") String id,
                       @RequestParam("password") String password)
    {
        System.out.println(id);
        System.out.println(password);
        return ("Hello, "+id+", you are "+ password +", so you are old enough to visit this page");
    }
}
