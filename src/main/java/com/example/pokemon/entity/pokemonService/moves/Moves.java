package com.example.pokemon.entity.pokemonService.moves;

import java.util.List;

public class Moves {
    private Integer id;
    private List<Move> move;
    private List<VersionGroupDetails> versionGroupDetails;

    public Moves() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Move> getMove() {
        return move;
    }

    public void setMove(List<Move> move) {
        this.move = move;
    }

    public List<VersionGroupDetails> getVersionGroupDetails() {
        return versionGroupDetails;
    }

    public void setVersionGroupDetails(List<VersionGroupDetails> versionGroupDetails) {
        this.versionGroupDetails = versionGroupDetails;
    }
}
