package pokemonfinal;

import java.util.ArrayList;
import java.util.Arrays;

import pokemon.Pokemon;
import pokemon.PokemonType;

public final class Charmeleon extends Pokemon {

    public Charmeleon() {
        super("Charmeleon", "Charmeleon", "Pokémon Chama", 5,
                new ArrayList<>(Arrays.asList(PokemonType.FOGO)),
                new ArrayList<>(Arrays.asList(PokemonType.AGUA, PokemonType.TERRA, PokemonType.ELETRICO)),
                Charmeleon.class.getResource("/images/Charmeleon.png").toString());
    }

    @Override
    public String description() {
        return "Charmeleon é a evolução de Charmander. Este Pokémon já está começando a\n"
        		+ "mostrar sua natureza feroz. Sua chama queima mais intensamente, indicando um\n"
        		+ "aumento em seu poder interno. Seus chifres afiados e atitude mais agressiva\n"
        		+ "tornam-no um adversário mais formidável. Charmeleon é um estágio intermediário\n"
        		+ "na evolução para o poderoso Charizard.";
    }


}
