package com.example.pokemon.controller;

import com.example.pokemon.entity.User;
import com.example.pokemon.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {

    @Autowired
    private IUserService IUserService;

    @PostMapping("/registration")
    public ModelAndView addUser(User user){
        ModelAndView modelAndView = new ModelAndView();
        User userFromDB = IUserService.findByLogin(user.getLogin());
        if (userFromDB != null){
            modelAndView.addObject("message", "Такой пользователь уже существует");
        }
        IUserService.save(user);
        modelAndView.setViewName("registration");
        return modelAndView;
    }
}
