package com.example.pokemon.entity.Pokemon.pokemonService.moves;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Moves {

    private Integer id;

    private Move move;

    @JsonProperty("version_group_details")
    private List<VersionGroupDetails> versionGroupDetails;
}
