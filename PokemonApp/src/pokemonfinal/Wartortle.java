package pokemonfinal;

import java.util.ArrayList;
import java.util.Arrays;

import pokemon.Pokemon;
import pokemon.PokemonType;

public final class Wartortle extends Pokemon {

    public Wartortle() {
        super("Wartortle", "Wartortle", "Pokémon Tartaruga", 8,
                new ArrayList<>(Arrays.asList(PokemonType.AGUA)),
                new ArrayList<>(Arrays.asList(PokemonType.ELETRICO, PokemonType.GRAMA, PokemonType.GELO)),
                Wartortle.class.getResource("/images/Wartortle.png").toString());
    }

    @Override
    public String description() {
        return "Wartortle é a evolução de Squirtle.\nSua concha tornou-se mais resistente,\n"
        		+ "proporcionando uma melhor defesa. Wartortle mantém suas habilidades aquáticas\n"
        		+ "e sua natureza de tartaruga. Este Pokémon de tipo Água continua a se fortalecer\n"
        		+ "e se desenvolver. Wartortle é o estágio intermediário na evolução para o\n"
        		+ "poderoso Blastoise.";
    }

}
