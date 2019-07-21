package com.example.pokemon.entity.pokemonService.heldItems;

import java.util.List;

public class HeldItems {
    private Integer id;
    private List<Items> items;
    private List<VersionDetails> versionDetails;

    public HeldItems() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    public List<VersionDetails> getVersionDetails() {
        return versionDetails;
    }

    public void setVersionDetails(List<VersionDetails> versionDetails) {
        this.versionDetails = versionDetails;
    }
}
