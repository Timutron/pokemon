package com.example.pokemon.entity.Pokemon.pokemonService;

import com.example.pokemon.entity.Pokemon.pokemonService.abilities.Abilities;
import com.example.pokemon.entity.Pokemon.pokemonService.forms.Forms;
import com.example.pokemon.entity.Pokemon.pokemonService.gameIndices.GameIndices;
import com.example.pokemon.entity.Pokemon.pokemonService.heldItems.HeldItems;
import com.example.pokemon.entity.Pokemon.pokemonService.moves.Moves;
import com.example.pokemon.entity.Pokemon.pokemonService.species.Species;
import com.example.pokemon.entity.Pokemon.pokemonService.sprites.Sprites;
import com.example.pokemon.entity.Pokemon.pokemonService.stats.PokemonStats;
import com.example.pokemon.entity.Pokemon.pokemonService.types.PokemonTypes;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
@Data
@NoArgsConstructor

public class PokemonService {

    private List<Abilities> abilities;

    @JsonProperty("base_experience")
    private Integer baseExsperiance;

    private List<Forms> forms;

    @JsonProperty("game_indices")
    private List<GameIndices> gameIndices;

    private Integer height;

    @JsonProperty("held_items")
    private List<HeldItems> heldItems;

    private Integer id;

    @JsonProperty("is_default")
    private Boolean isDefault;

    @JsonProperty("location_area_encounters")
    private String locationAreaEncounters;

    private List<Moves> moves;

    private String name;

    private Integer order;

    private Species species;

    private Sprites sprites;

    @JsonProperty("stats")
    private List<PokemonStats> pokemonStats;

    @JsonProperty("types")
    private List<PokemonTypes> pokemonTypes;

    private Integer weight;
}
