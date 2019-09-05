package com.example.pokemon.service;

import com.example.pokemon.entity.User;

import java.util.List;

public interface IUserService {

    void save(User user);

    User findByLogin(String login);

    User findByUserId(Integer id);

    List<User> findAll();
}
