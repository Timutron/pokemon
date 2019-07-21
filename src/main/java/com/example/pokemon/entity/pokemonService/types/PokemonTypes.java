package com.example.pokemon.entity.pokemonService.types;

import com.example.pokemon.entity.pokemonService.types.PokType;

import java.util.List;

public class PokemonTypes {
    private Integer id;
    private Integer slot;
    private List<PokType> pokType;

    public PokemonTypes() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    public List<PokType> getPokType() {
        return pokType;
    }

    public void setPokType(List<PokType> pokType) {
        this.pokType = pokType;
    }
}
