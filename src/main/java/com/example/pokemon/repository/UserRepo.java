package com.example.pokemon.repository;

import com.example.pokemon.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    User save(User user);
    User findByLogin(String login);
    User findByUserId(Integer id);
}
