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
        return "Bulbasaur é um Pokémon quadrúpede com uma semente planta crescendo em suas costas. Essa semente se desenvolverá em uma planta forte à medida que Bulbasaur evolui."
                + "\n"
                + "Este Pokémon é uma escolha popular entre treinadores, pois combina as características de Grama e Veneno. A semente nas suas costas cresce à medida que ele evolui para Ivysaur e, eventualmente, para Venusaur.";
    }

}
