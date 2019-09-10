package com.example.pokemon.service;

import com.example.pokemon.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IUserService {

    void save(User user);

    User findByLogin(String login);

    List<User> findByUserId(Integer id);

    Page<User> findAll(Pageable pageable);
}
