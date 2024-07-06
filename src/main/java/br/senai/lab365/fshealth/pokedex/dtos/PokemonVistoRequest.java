package br.senai.lab365.fshealth.pokedex.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

public class PokemonVistoRequest {
    @NotNull private int numero;
    private String nome;
    private String imagemUrl;
    private String habitat;

}
