package com.example.pokemon.entity.Pokemon.pokemonService.gameIndices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GameIndices {

    private Integer id;

    @JsonProperty("game_index")
    private Integer gameIndex;

    @JsonProperty("version")
    private Versions versions;
}
