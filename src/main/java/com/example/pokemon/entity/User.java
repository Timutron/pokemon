package com.example.pokemon.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@Entity
@Audited
@Data
public class User {
    @Id
    @GeneratedValue
    private Integer userId;
    private String login;
    private String password;
    private Boolean active = true;
    private String role;
}
