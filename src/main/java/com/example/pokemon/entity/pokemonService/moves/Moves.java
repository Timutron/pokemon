package com.example.pokemon.entity.pokemonService.moves;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Moves {
    private Integer id;
    private Move move;
    private VersionGroupDetails versionGroupDetails;
}
