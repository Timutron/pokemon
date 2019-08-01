package com.example.pokemon.entity.pokemonService.sprites;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Sprites {
    private Integer id;
    private String backDefault;
    private String backFemale;
    private String backShiny;
    private String backShinyFemale;
    private String frontDefault;
    private String frontFemale;
    private String frontShiny;
    private String frontShinyFemale;
}
