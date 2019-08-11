package com.example.pokemon.entity.pokemonService.heldItems;

import com.example.pokemon.entity.pokemonService.gameIndices.Versions;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class VersionDetails {

    private Integer id;

    private Integer rarity;

    @JsonProperty("version")
    private Versions versions;
}
