package com.example.pokemon.entity.pokemonService.stats;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PokemonStats {

    private Integer id;

    @JsonProperty("base_stat")
    private Integer baseStat;

    private Integer effort;

    private Stat stat;
}
