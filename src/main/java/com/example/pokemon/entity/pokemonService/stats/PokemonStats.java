package com.example.pokemon.entity.pokemonService.stats;

import com.example.pokemon.entity.pokemonService.stats.Stat;

import java.util.List;

public class PokemonStats {
    private Integer id;
    private Integer baseStat;
    private Integer effort;
    private List<Stat> stat;

    public PokemonStats() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBaseStat() {
        return baseStat;
    }

    public void setBaseStat(Integer baseStat) {
        this.baseStat = baseStat;
    }

    public Integer getEffort() {
        return effort;
    }

    public void setEffort(Integer effort) {
        this.effort = effort;
    }

    public List<Stat> getStat() {
        return stat;
    }

    public void setStat(List<Stat> stat) {
        this.stat = stat;
    }
}
