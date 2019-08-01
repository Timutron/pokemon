package com.example.pokemon.entity.pokemonService.moves;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class VersionGroupDetails {
    private Integer id;
    private Integer levelLearnedAt;
    private MoveLearnMethod moveLearnMethods;
    private VersionGroup versionGroups;
}
