package com.example.pokemon.entity.Pokemon.pokemonService.sprites;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class Sprites {
    @Id
    private Integer id;

    @JsonProperty("back_default")
    private String backDefault;

    @JsonProperty("back_female")
    private String backFemale;

    @JsonProperty("back_shiny")
    private String backShiny;

    @JsonProperty("back_shiny_female")
    private String backShinyFemale;

    @JsonProperty("front_default")
    private String frontDefault;

    @JsonProperty("front_female")
    private String frontFemale;

    @JsonProperty("front_shiny")
    private String frontShiny;

    @JsonProperty("front_shiny_female")
    private String frontShinyFemale;
}
