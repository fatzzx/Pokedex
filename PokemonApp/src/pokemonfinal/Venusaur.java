package pokemonfinal;

import java.util.ArrayList;
import java.util.Arrays;

import pokemon.Pokemon;
import pokemon.PokemonType;

public final class Venusaur extends Pokemon {

    public Venusaur() {
        super("Venusaur", "Venusaur", "Pokémon Flor", 3,
                new ArrayList<>(Arrays.asList(PokemonType.GRAMA, PokemonType.VENENOSO)),
                new ArrayList<>(Arrays.asList(PokemonType.FOGO, PokemonType.VOADOR, PokemonType.PSIQUICO)),
                Venusaur.class.getResource("/images/Venusaur.png").toString());
    }

    @Override
    public String description() {
        return "Venusaur é a forma final de evolução da linha Bulbasaur. A flor em suas costas floresceu completamente, tornando-se uma presença imponente e poderosa."
                + "\n"
                + "Este Pokémon mantém os tipos de Grama e Veneno e possui ataques poderosos associados a esses elementos. Venusaur é respeitado por sua força e beleza natural.";
    }

}
