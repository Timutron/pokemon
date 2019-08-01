package com.example.pokemon.entity.pokemonService.stats;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PokemonStats {
    private Integer id;
    private Integer baseStat;
    private Integer effort;
    private Stat stat;
}
