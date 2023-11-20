package pokemonfinal;

import java.util.ArrayList;
import java.util.Arrays;

import pokemon.Pokemon;
import pokemon.PokemonType;

public final class Ivysaur extends Pokemon {

    public Ivysaur() {
        super("Ivysaur", "Ivysaur", "Pokémon Semente", 2,
                new ArrayList<>(Arrays.asList(PokemonType.GRAMA, PokemonType.VENENOSO)),
                new ArrayList<>(Arrays.asList(PokemonType.FOGO, PokemonType.VOADOR, PokemonType.PSIQUICO)),
                Ivysaur.class.getResource("/images/Ivysaur.png").toString());
    }

    @Override
    public String description() {
        return "Ivysaur é a evolução de Bulbasaur. A planta nas costas de Bulbasaur cresceu para se tornar uma flor maior e mais impressionante em Ivysaur."
                + "\n"
                + "Esta evolução mantém os tipos de Grama e Veneno, combinando ataques poderosos desses elementos. A planta continua a crescer à medida que Ivysaur evolui para Venusaur.";
    }

}
