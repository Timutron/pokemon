package com.example.pokemon.service.implementation;

import com.example.pokemon.entity.User;
import com.example.pokemon.repository.IMyUserRepo;
import com.example.pokemon.repository.UserRepo;
import com.example.pokemon.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private IMyUserRepo myUserRepo;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

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

    @Override
    public User findByUserId(Integer id) {
        return userRepo.findByUserId(id);
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return userRepo.findAll(pageable);
    }
}

