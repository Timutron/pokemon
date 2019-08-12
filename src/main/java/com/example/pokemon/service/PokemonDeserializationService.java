package com.example.pokemon.service;

import com.example.pokemon.entity.Pokemon.Pokemon;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.stereotype.Service;

import java.io.IOException;
@Service
public class PokemonDeserializationService {

    ObjectMapper objectMapper = new ObjectMapper();

    public Pokemon getPoke() throws UnirestException, IOException {
        String request = Unirest.get("https://pokeapi.co/api/v2/pokemon/")
                .asString()
                .getBody();
        return objectMapper.readValue(request, Pokemon.class);
    }
}
