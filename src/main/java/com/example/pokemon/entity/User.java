package com.example.pokemon.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;
import org.springframework.hateoas.ResourceSupport;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@Entity
@Audited
@Data
@EqualsAndHashCode(callSuper = false)
public class User extends ResourceSupport {
    @Id
    @GeneratedValue
    private Integer userId;
    private String login;
    private String password;
    private Boolean active = true;
    private String role;
}
