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

import java.util.List;

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
    private List<Species> species;
    private List<Sprites> sprites;
    private List<PokemonStats> pokemonStats;
    private List<PokemonTypes> pokemonTypes;
    private Integer weight;

    public PokemonService() {
    }

    public List<Abilities> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<Abilities> abilities) {
        this.abilities = abilities;
    }

    public Integer getBaseExsperiance() {
        return baseExsperiance;
    }

    public void setBaseExsperiance(Integer baseExsperiance) {
        this.baseExsperiance = baseExsperiance;
    }

    public List<Forms> getForms() {
        return forms;
    }

    public void setForms(List<Forms> forms) {
        this.forms = forms;
    }

    public List<GameIndices> getGameIndices() {
        return gameIndices;
    }

    public void setGameIndices(List<GameIndices> gameIndices) {
        this.gameIndices = gameIndices;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public List<HeldItems> getHeldItems() {
        return heldItems;
    }

    public void setHeldItems(List<HeldItems> heldItems) {
        this.heldItems = heldItems;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }

    public String getLocationAreaEncounters() {
        return locationAreaEncounters;
    }

    public void setLocationAreaEncounters(String locationAreaEncounters) {
        this.locationAreaEncounters = locationAreaEncounters;
    }

    public List<Moves> getMoves() {
        return moves;
    }

    public void setMoves(List<Moves> moves) {
        this.moves = moves;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public List<Species> getSpecies() {
        return species;
    }

    public void setSpecies(List<Species> species) {
        this.species = species;
    }

    public List<Sprites> getSprites() {
        return sprites;
    }

    public void setSprites(List<Sprites> sprites) {
        this.sprites = sprites;
    }

    public List<PokemonStats> getPokemonStats() {
        return pokemonStats;
    }

    public void setPokemonStats(List<PokemonStats> pokemonStats) {
        this.pokemonStats = pokemonStats;
    }

    public List<PokemonTypes> getPokemonTypes() {
        return pokemonTypes;
    }

    public void setPokemonTypes(List<PokemonTypes> pokemonTypes) {
        this.pokemonTypes = pokemonTypes;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
