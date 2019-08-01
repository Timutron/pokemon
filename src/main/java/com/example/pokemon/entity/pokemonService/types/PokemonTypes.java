package com.example.pokemon.entity.pokemonService.types;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PokemonTypes {
    private Integer id;
    private Integer slot;
    private PokType pokType;
}
