package com.example.pokemon.controller;

import com.example.pokemon.service.PokemonDeserializationService;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@RestController
public class PokemonController {

    @Autowired
    PokemonDeserializationService pokeService;

    @GetMapping("/pokemonList")
    public ModelAndView getPokeList() throws IOException, UnirestException {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("pokemonList", pokeService.getPoke().getPokemonList());
        return modelAndView;
    }
}
