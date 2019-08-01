package com.example.pokemon.entity.pokemonService;

import com.example.pokemon.entity.pokemonService.abilities.Abilities;
import com.example.pokemon.entity.pokemonService.forms.Forms;
import com.example.pokemon.entity.pokemonService.gameIndices.GameIndices;
import com.example.pokemon.entity.pokemonService.heldItems.HeldItems;
import com.example.pokemon.entity.pokemonService.moves.Moves;
import com.example.pokemon.entity.pokemonService.species.Species;
import com.example.pokemon.entity.pokemonService.sprites.Sprites;
import com.example.pokemon.entity.pokemonService.stats.PokemonStats;
import com.example.pokemon.entity.pokemonService.types.PokemonTypes;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
public class PokemonService {
    private List<Abilities> abilities;
    private Integer baseExsperiance;
    private List<Forms> forms;
    private List<GameIndices> gameIndices;
    private Integer height;
    private List<HeldItems> heldItems;
    private Integer id;
    private Boolean isDefault;
    private String locationAreaEncounters;
    private List<Moves> moves;
    private String name;
    private Integer order;
    private Species species;
    private Sprites sprites;
    private List<PokemonStats> pokemonStats;
    private List<PokemonTypes> pokemonTypes;
    private Integer weight;
}
