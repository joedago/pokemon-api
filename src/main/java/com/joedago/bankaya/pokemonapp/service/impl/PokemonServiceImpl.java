package com.joedago.bankaya.pokemonapp.service.impl;

import com.joedago.bankaya.pokemonapp.connection.rest.PokemonApiConnector;
import com.joedago.bankaya.pokemonapp.model.Pokemon;
import com.joedago.bankaya.pokemonapp.service.PokemonService;

import java.util.Optional;

public class PokemonServiceImpl implements PokemonService {

    private final PokemonApiConnector pokemonApiConnector;

    public PokemonServiceImpl(PokemonApiConnector pokemonApiConnector) {
        this.pokemonApiConnector = pokemonApiConnector;
    }

    @Override
    public Pokemon findPokemon(String pokemonName) {
        Optional<Pokemon> pokemon = pokemonApiConnector.getPokemon(pokemonName);
        return pokemon.orElseThrow();
    }
}
