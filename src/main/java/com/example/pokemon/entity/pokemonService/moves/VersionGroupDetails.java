package com.example.pokemon.entity.pokemonService.moves;

import java.util.List;

public class VersionGroupDetails {
    private Integer id;
    private Integer levelLearnedAt;
    private List<MoveLearnMethod> moveLearnMethods;
    private List<VersionGroup> versionGroups;

    public VersionGroupDetails() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLevelLearnedAt() {
        return levelLearnedAt;
    }

    public void setLevelLearnedAt(Integer levelLearnedAt) {
        this.levelLearnedAt = levelLearnedAt;
    }

    public List<MoveLearnMethod> getMoveLearnMethods() {
        return moveLearnMethods;
    }

    public void setMoveLearnMethods(List<MoveLearnMethod> moveLearnMethods) {
        this.moveLearnMethods = moveLearnMethods;
    }

    public List<VersionGroup> getVersionGroups() {
        return versionGroups;
    }

    public void setVersionGroups(List<VersionGroup> versionGroups) {
        this.versionGroups = versionGroups;
    }
}
