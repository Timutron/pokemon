package com.example.pokemon.controller;

import com.example.pokemon.entity.User;
import com.example.pokemon.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
public class RegistrationController {

    @Autowired
    private IUserService IUserService;

    @PostMapping("/registration")
    public ModelAndView addUser(User user){
        ModelAndView modelAndView = new ModelAndView();
        User userFromDB = IUserService.findByLogin(user.getLogin());
        if (userFromDB != null){
            modelAndView.addObject("message", "Такой пользователь уже существует");
            log.info("Попытка создания зарегестрированного пользователя");
        }
        IUserService.save(user);
        log.info("Создан новый пользователь");
        modelAndView.setViewName("registration");
        return modelAndView;
    }
}
