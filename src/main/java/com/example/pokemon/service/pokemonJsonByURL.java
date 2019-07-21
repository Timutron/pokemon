//package com.example.pokemon.service;
//
//import com.example.pokemon.entity.pokemonService.PokemonService;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import java.io.IOException;
//import java.net.URL;
//
//public class pokemonJsonByURL {
//    ObjectMapper mapper = new ObjectMapper();
//    PokemonService pok;
//
//    {
//        try {
//            pok = mapper.readValue(new URL("https://pokeapi.co/api/v2/pokemon/"), PokemonService.class);
//            System.out.println(pok);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
