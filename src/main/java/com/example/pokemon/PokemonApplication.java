package com.example.pokemon;

import com.example.pokemon.entity.pokemonService.PokemonService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.URL;

@SpringBootApplication
public class PokemonApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokemonApplication.class, args);

		ObjectMapper mapper = new ObjectMapper();
		PokemonService pok;

		{
			try {
				pok = mapper.readValue(new URL("https://pokeapi.co/api/v2/pokemon/"), PokemonService.class);
				System.out.println(pok);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
