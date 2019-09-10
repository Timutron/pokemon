package com.example.pokemon.controller;

import com.example.pokemon.entity.User;
import com.example.pokemon.entity.UserResource;
import com.example.pokemon.service.IUserService;
import com.example.pokemon.service.UserResourceAssembler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    IUserService iUserService;

    @GetMapping("/{userId}")
    public UserResource getUserById(@PathVariable Integer userId){
        User user = iUserService.findByUserId(userId);
        return new UserResourceAssembler().toResource(user);
    }

    @GetMapping("/all")
    public Page<User> getAllUser(){
        Page<User> users = iUserService.findAll(PageRequest.of(0,5));
        for (User user : users){
            user.add(linkTo(UserController.class).slash(user.getUserId()).withSelfRel());
        }
        return users;
    }
}
