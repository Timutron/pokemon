package com.example.pokemon.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@Entity
@Data public class User {
    @Id
    @GeneratedValue
    private Integer id;
    private String login;
    private String password;
    private Boolean active = true;
    private String role;
}
