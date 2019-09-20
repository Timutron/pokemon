package com.example.pokemon.controller;

import com.example.pokemon.service.implementation.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@ExtendWith(SpringExtension.class)
class RegistrationControllerTest {

    @Autowired
    MockMvc mockMvc;

    @InjectMocks
    RegistrationController registrationController;

    @MockBean
    UserServiceImpl userService;

    @MockBean
    BCryptPasswordEncoder encoder;

//    @Test
//    void addUser() throws Exception {
//        mockMvc.perform(post("/registration")
//                .param("Login", "Timur")
//                .param("password", "12345"))
//                .andDo(print())
//                .andExpect(status().isOk());
//    }

    @Test
    void testPage() throws Exception {
        mockMvc.perform(get("/registration"))
                .andDo(print())
                .andExpect(status().isOk());
    }
}