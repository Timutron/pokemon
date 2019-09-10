package com.example.pokemon.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.ResourceSupport;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class UserResource extends ResourceSupport {
    private String login;
    private String role;
}
