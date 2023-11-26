package pokemonfinal;

import java.util.ArrayList;
import java.util.Arrays;

import pokemon.Pokemon;
import pokemon.PokemonType;

public final class Charizard extends Pokemon {

    public Charizard() {
        super("Charizard", "Charizard", "Pokémon dragao", 6,
                new ArrayList<>(Arrays.asList(PokemonType.FOGO, PokemonType.VOADOR)),
                new ArrayList<>(Arrays.asList(PokemonType.AGUA, PokemonType.TERRA, PokemonType.ELETRICO)),
                Charizard.class.getResource("/images/Charizard.png").toString());
    }

    @Override
    public String description() {
        return "Charizard é a forma final de evolução da linha Charmander. Este majestoso\n"
        		+ "Pokémon é conhecido por sua chama que queima com uma intensidade incrível,\n"
        		+ "indicando sua força e poder. Com asas poderosas, Charizard é capaz de voar pelos\n"
        		+ "céus. Ele é um Pokémon de Fogo e Voador, tornando-o ainda mais versátil em\n"
        		+ "batalhas. Charizard é respeitado por sua incrível força e presença imponente.";
    }


}
