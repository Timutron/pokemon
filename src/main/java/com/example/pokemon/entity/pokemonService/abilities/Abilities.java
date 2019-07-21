package com.example.pokemon.entity.pokemonService.abilities;

import java.util.List;

public class Abilities {
    private Integer id;
    private List<Ability> ability;
    private Boolean isHiden;
    private Integer slot;

    public Abilities() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Ability> getAbility() {
        return ability;
    }

    public void setAbility(List<Ability> ability) {
        this.ability = ability;
    }

    public Boolean getHiden() {
        return isHiden;
    }

    public void setHiden(Boolean hiden) {
        isHiden = hiden;
    }

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }
}
