package com.joedago.bankaya.pokemonapp.connection.rest;

import com.joedago.bankaya.pokemonapp.model.Pokemon;
import com.joedago.bankaya.pokemonapp.model.PokemonResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriBuilderFactory;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Optional;

@Service
public class PokemonApiConnector {

    private final RestTemplate restTemplate;

    @Value("{pokemon.api.url}")
    private String pokemonApiUrl;

    public PokemonApiConnector(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    public Optional<Pokemon> getPokemon(String name) {
        UriComponents uriComponents = UriComponentsBuilder.fromHttpUrl(pokemonApiUrl).path(name).build();
        return Optional.ofNullable(restTemplate.getForObject(uriComponents.toUri(), Pokemon.class));
    }



}
