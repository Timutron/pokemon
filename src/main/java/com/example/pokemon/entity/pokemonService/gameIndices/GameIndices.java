package com.example.pokemon.entity.pokemonService.gameIndices;

import java.util.List;

public class GameIndices {
    private Integer id;
    private List<Versions> versions;

    public GameIndices() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Versions> getVersions() {
        return versions;
    }

    public void setVersions(List<Versions> versions) {
        this.versions = versions;
    }
}
