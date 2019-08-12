package com.example.pokemon.service.implementation;

import com.example.pokemon.entity.User;
import com.example.pokemon.repository.UserRepo;
import com.example.pokemon.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserRepo userRepo;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRole("USER");
        userRepo.save(user);
    }

    @Override
    public User findByLogin(String login) {
        return userRepo.findByLogin(login);
    }
}
