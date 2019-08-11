package com.example.pokemon;

import com.example.pokemon.entity.pokemonService.PokemonService;
import com.example.pokemon.entity.pokemonService.abilities.Abilities;
import com.example.pokemon.entity.pokemonService.abilities.Ability;
import com.example.pokemon.entity.pokemonService.forms.Forms;
import com.fasterxml.classmate.GenericType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class PokemonApplication {

	public static void main(String[] args) throws UnirestException, IOException {
		SpringApplication.run(PokemonApplication.class, args);

		//Код с использованием RestTemplate и HttpHeaders
//		RestTemplate rt = new RestTemplate();
//		HttpHeaders headers = new HttpHeaders();
//		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//		headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
//		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
//		String url = "https://pokeapi.co/api/v2/pokemon/ditto/";
//		ResponseEntity<String> res = rt.exchange(url, HttpMethod.GET, entity, String.class);
//		System.out.println(res);

		//Код Unirest
        String request = Unirest.get("https://pokeapi.co/api/v2/pokemon/ditto/")
                .asString()
                .getBody();

        PokemonService pokemonService;

		ObjectMapper objectMapper = new ObjectMapper();
		pokemonService = objectMapper.readValue(request, PokemonService.class);
		System.out.println(pokemonService.getSprites());

		//System.out.println(objectMapper.readValue(request, PokemonService.class));
	}
}
