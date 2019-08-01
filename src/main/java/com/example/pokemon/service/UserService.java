package com.example.pokemon.service;

import com.example.pokemon.entity.User;

public interface UserService {

    void save(User user);

    User findByLogin(String login);
}
