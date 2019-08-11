package com.example.pokemon.entity.pokemonService.heldItems;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class HeldItems {

    private Integer id;

    @JsonProperty("item")
    private Items items;

    @JsonProperty("version_details")
    private List<VersionDetails> versionDetails;
}
