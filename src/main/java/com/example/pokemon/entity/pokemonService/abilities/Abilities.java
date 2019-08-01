package com.example.pokemon.entity.pokemonService.abilities;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Abilities {
    private Integer id;
    private Ability ability;
    private Boolean isHiden;
    private Integer slot;
}
