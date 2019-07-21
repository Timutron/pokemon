package com.example.pokemon.entity.pokemonService.heldItems;

import com.example.pokemon.entity.pokemonService.gameIndices.Versions;

import java.util.List;

public class VersionDetails {
    private Integer id;
    private Integer rarity;
    private List<Versions> versions;

    public VersionDetails() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRarity() {
        return rarity;
    }

    public void setRarity(Integer rarity) {
        this.rarity = rarity;
    }

    public List<Versions> getVersions() {
        return versions;
    }

    public void setVersions(List<Versions> versions) {
        this.versions = versions;
    }
}
