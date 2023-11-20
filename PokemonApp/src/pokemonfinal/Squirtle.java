package pokemonfinal;

import java.util.ArrayList;
import java.util.Arrays;

import pokemon.Pokemon;
import pokemon.PokemonType;

public final class Squirtle extends Pokemon {

    public Squirtle() {
        super("Squirtle", "Squirtle", "Pokémon Tartaruga", 7,
                new ArrayList<>(Arrays.asList(PokemonType.AGUA)),
                new ArrayList<>(Arrays.asList(PokemonType.ELETRICO, PokemonType.GRAMA, PokemonType.GELO)),
                Squirtle.class.getResource("/images/Squirtle.png").toString());
    }

    @Override
    public String description() {
        return "Squirtle é um Pokémon aquático com características de tartaruga. Ele é conhecido por sua concha robusta e sua habilidade de disparar jatos d'água contra seus adversários."
                + "\n"
                + "Este Pokémon de tipo Água é uma escolha popular entre os treinadores. Squirtle evolui para Wartortle e, eventualmente, para Blastoise, aumentando seu poder e habilidades aquáticas.";
    }

}
