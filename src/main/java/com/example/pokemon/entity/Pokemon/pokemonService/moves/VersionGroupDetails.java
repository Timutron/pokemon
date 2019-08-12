package com.example.pokemon.entity.Pokemon.pokemonService.moves;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class VersionGroupDetails {

    private Integer id;

    @JsonProperty("level_learned_at")
    private Integer levelLearnedAt;

    @JsonProperty("move_learn_method")
    private MoveLearnMethod moveLearnMethod;

    @JsonProperty("version_group")
    private VersionGroup versionGroup;
}
