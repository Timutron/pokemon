package com.example.pokemon.entity.Pokemon;

import com.example.pokemon.entity.Pokemon.PokemonList;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@NoArgsConstructor
@JsonIgnoreProperties({ "count", "next", "previous" })
@Entity
public class Pokemon {
    @Id
    private Integer Id;
    @JsonProperty("results")
    @OneToMany(targetEntity = Pokemon.class)
    private List<PokemonList> pokemonList;
}
