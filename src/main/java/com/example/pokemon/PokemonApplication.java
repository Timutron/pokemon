package com.example.pokemon;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class PokemonApplication {

	public static void main(String[] args) throws UnirestException, IOException {
		SpringApplication.run(PokemonApplication.class, args);
	}
}
