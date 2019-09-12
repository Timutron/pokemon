package com.example.pokemon.controller;

import com.example.pokemon.entity.User;
import com.example.pokemon.entity.UserResource;
import com.example.pokemon.service.IUserService;
import com.example.pokemon.hateoas.UserResourceAssembler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedResources;
import org.springframework.web.bind.annotation.*;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserService iUserService;
    @Autowired
    private UserResourceAssembler resourceAssembler;

    @GetMapping("/{userId}")
    public UserResource getUserById(@PathVariable Integer userId){
        User user = iUserService.findByUserId(userId);
        return resourceAssembler.toResource(user);
    }

    @GetMapping("/all")
    public PagedResources<UserResource> getAllUser(Pageable pageable, PagedResourcesAssembler<User> pagedResourcesAssembler){
        Page<User> users = iUserService.findAll(PageRequest.of(0,5));
        return pagedResourcesAssembler.toResource(users, resourceAssembler);
    }
}
