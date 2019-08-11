package com.example.pokemon.entity.pokemonService.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PokemonTypes {
    private Integer id;
    private Integer slot;
    @JsonProperty("type")
    private PokType pokType;
}
