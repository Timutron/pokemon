package com.example.pokemon.service;

import com.example.pokemon.controller.UserController;
import com.example.pokemon.entity.User;
import com.example.pokemon.entity.UserResource;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

public class UserResourceAssembler extends ResourceAssemblerSupport<User, UserResource> {
    public UserResourceAssembler() {
        super(UserController.class, UserResource.class);
    }

    @Override
    public UserResource toResource(User user) {
        UserResource resource = super.createResourceWithId(user.getUserId(), user);
        resource.setLogin(user.getLogin());
        resource.setRole(user.getRole());
        return resource;
    }
}
