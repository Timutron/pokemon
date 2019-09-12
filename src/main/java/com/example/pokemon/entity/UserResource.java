package com.example.pokemon.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.ResourceSupport;

@Data
@NoArgsConstructor
public class UserResource extends ResourceSupport {
    private Integer userId;
    private String login;
    private String role;

}
