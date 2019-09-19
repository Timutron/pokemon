package com.example.pokemon.service.implementation;

import com.example.pokemon.entity.User;
import com.example.pokemon.repository.UserRepo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@DisplayName("Тест класса UserService")
@ExtendWith(SpringExtension.class)
class UserServiceImplTest {
    @InjectMocks
    UserServiceImpl userService;
    @Mock
    UserRepo userRepo;
    @Mock
    BCryptPasswordEncoder passwordEncoder;

    @DisplayName("Тест сохранения пользователя")
    @Test
    void save() {
        User newUser = new User(1,"Timutron","123", true, "USER");
        when(userRepo.save(any(User.class))).thenReturn(newUser);
        User saveUser = userService.save(newUser);
        assertNotNull(saveUser);
        verify(userRepo, times(1)).save(saveUser);
    }

    @DisplayName("Тест поиска пользователя по логину")
    @Test
    void findByLogin() {
        User user = new User(1,"Timutron","123",true,"USER");
        when(userRepo.findByLogin("")).thenReturn(user);
        assertEquals("Timutron" ,user.getLogin());
    }
}