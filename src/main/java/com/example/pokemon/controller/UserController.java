package com.example.pokemon.controller;

import com.example.pokemon.entity.User;
import com.example.pokemon.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    IUserService iUserService;

    @GetMapping("/{userId}")
    public List<User> getUserById(@PathVariable Integer userId){
        List<User> user = iUserService.findByUserId(userId);
        //user.add(ControllerLinkBuilder.linkTo(UserController.class).slash(user.getUserId()).withSelfRel());
        return user;
    }

    @GetMapping("/all")
    public Page<User> getAllUser(){
        Page<User> users = iUserService.findAll(PageRequest.of(0,5));
        for (User user : users){
            user.add(ControllerLinkBuilder.linkTo(UserController.class).slash(user.getUserId()).withSelfRel());
        }
        return users;
    }
}
