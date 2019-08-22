package com.example.pokemon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageGetMethodController {

    @GetMapping("/registration")
    public String registration(){
        return "registration";
    }

    @GetMapping({"/", "/homePage"})
    public String homePage(){
        return "homePage";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/closedPage")
    public String userPage(){
        return "closedPage";
    }

}
