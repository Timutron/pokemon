package com.example.pokemon.repository;

import com.example.pokemon.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
@ExtendWith(SpringExtension.class)
@AutoConfigureTestDatabase(replace=AutoConfigureTestDatabase.Replace.NONE)
class UserRepoTest {

    @Autowired
    UserRepo userRepo;
    @Autowired
    TestEntityManager testEntityManager;

    @Test
    void findByLogin() {
        User user = new User(1,"Timur", "12345");
        userRepo.save(user);
        User user1 = userRepo.findByLogin("Timur");
        assertNotNull(user);
        assertEquals(user1.getLogin(), user.getLogin());
    }
}