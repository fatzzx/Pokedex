package pokemonfinal;

import java.util.ArrayList;
import java.util.Arrays;

import pokemon.Pokemon;
import pokemon.PokemonType;


public final class Charmander extends Pokemon {

    public Charmander() {
        super("Charmander","Charmander","Pokémon Lagarto", 4,
        		new ArrayList<>(Arrays.asList(PokemonType.FOGO)),
        		new ArrayList<>(Arrays.asList(PokemonType.AGUA, PokemonType.TERRA, PokemonType.ELETRICO)),
        		Charmander.class.getResource("/images/Charmander.png").toString());
    }


    @Override
    public String description() {
        return "Charmander é um Pokémon reptiliano bípede. A maior parte de seu corpo é\n"
        		+ "laranja, enquanto sua barriga é amarelo claro e tem olhos azuis. Tem uma chama\n"
        		+ "na ponta da cauda, o que significa sua saúde. O design de Charmander é baseado\n"
        		+ "em um lagarto, porém como o próprio nome sugere também pode ter sido inspirado\n"
        		+ "em salamandras, que na mitologia têm afinidade com o fogo. Charmander é\n";
    }

	
}