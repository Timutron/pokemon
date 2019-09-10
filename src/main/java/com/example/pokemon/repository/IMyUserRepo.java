package com.example.pokemon.repository;

import com.example.pokemon.entity.User;

import java.util.List;

public interface IMyUserRepo {
    List<User> myFindById(Integer userId);

}
