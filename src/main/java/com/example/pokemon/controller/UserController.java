package com.example.pokemon.controller;

import com.example.pokemon.entity.User;
import com.example.pokemon.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    IUserService iUserService;

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable Integer userId){
        User user = iUserService.findByUserId(userId);
        user.add(ControllerLinkBuilder.linkTo(UserController.class).slash(user.getUserId()).withSelfRel());
        return user;
    }

    @GetMapping("/all")
    public List<User> getAllUser(){
        List<User> users = iUserService.findAll();
        for (User user : users){
            user.add(ControllerLinkBuilder.linkTo(UserController.class).slash(user.getUserId()).withSelfRel());
        }
        return users;
    }
}
