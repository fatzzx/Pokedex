package pokemonfinal;

import java.util.ArrayList;
import java.util.Arrays;

import pokemon.Pokemon;
import pokemon.PokemonType;

public final class Bulbasaur extends Pokemon {

    public Bulbasaur() {
        super("Bulbasaur", "Bulbasaur", "Pokémon Semente", 1,
                new ArrayList<>(Arrays.asList(PokemonType.GRAMA, PokemonType.VENENOSO)),
                new ArrayList<>(Arrays.asList(PokemonType.FOGO, PokemonType.VOADOR, PokemonType.PSIQUICO)),
                Bulbasaur.class.getResource("/images/Bulbasaur.png").toString());
    }

    @Override
    public String description() {
        return "Bulbasaur é um Pokémon quadrúpede\n"
        		+ "com uma semente planta em suas costas. A semente\n"
        		+ "se desenvolve em uma planta forte conforme\n"
        		+ "Bulbasaur evolui. Este Pokémon, combinando\n"
        		+ "as características de Grama e Veneno, é popular\n"
        		+ "entre treinadores. A semente cresce ao evoluir\n"
        		+ "para Ivysaur e, eventualmente, Venusaur.";
    }


}
