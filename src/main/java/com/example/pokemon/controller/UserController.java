package com.example.pokemon.controller;

import com.example.pokemon.entity.User;
import com.example.pokemon.entity.UserResource;
import com.example.pokemon.hateoas.UserResourceAssembler;
import com.example.pokemon.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.MediaTypes;
import org.springframework.hateoas.PagedResources;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users", produces = MediaTypes.HAL_JSON_VALUE)
public class UserController {

    @Autowired
    private IUserService iUserService;
    @Autowired
    private UserResourceAssembler resourceAssembler;
    @Autowired
    private PagedResourcesAssembler<User> pagedResourcesAssembler;

    @GetMapping("/{userId}")
    public UserResource getUserById(@PathVariable Integer userId){
        User user = iUserService.findByUserId(userId);
        return resourceAssembler.toResource(user);
    }

    @GetMapping(value = "/all")
    public PagedResources<UserResource> getAllUser(@PageableDefault Pageable pageable){
        Page<User> users = iUserService.findAll(pageable);
        return pagedResourcesAssembler.toResource(users, resourceAssembler);
    }
}
