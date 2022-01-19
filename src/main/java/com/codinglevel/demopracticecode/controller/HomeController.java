package com.codinglevel.demopracticecode.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String getHome() {
        return "Here is the home page";
    }

    @GetMapping("/student")
    public String students() {
        return "Here is the home pae";
    }

    @GetMapping("/admin")
    public String users() {
        return "Welcome to user page";
    }
    
}
