package com.example.pokemon.entity.pokemonService.heldItems;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HeldItems {
    private Integer id;
    private Items items;
    private VersionDetails versionDetails;
}
