package com.example.pokemon.entity.Pokemon.pokemonService.abilities;

import com.example.pokemon.entity.Pokemon.pokemonService.PokemonService;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@NoArgsConstructor

public class Abilities {

    private Integer id;

    private Ability ability;

    @JsonProperty("is_hidden")
    private Boolean isHidden;

    private Integer slot;

}
