package com.example.pokemon.controller;

import com.example.pokemon.entity.User;
import com.example.pokemon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {

    @Autowired
    private UserService userService;

    @PostMapping("/registration")
    public ModelAndView addUser(User user){
        ModelAndView modelAndView = new ModelAndView();
        User userFromDB = userService.findByLogin(user.getLogin());
        if (userFromDB != null){
            modelAndView.addObject("message", "Такой пользователь уже существует");
        }
        userService.save(user);
        modelAndView.setViewName("registration");
        return modelAndView;
    }
}
