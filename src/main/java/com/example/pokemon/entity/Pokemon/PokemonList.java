package com.example.pokemon.entity.Pokemon;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@JsonIgnoreProperties({"count", "next", "previous", "results"})
@Entity
public class PokemonList {
    @Id
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("url")
    private String url;
}