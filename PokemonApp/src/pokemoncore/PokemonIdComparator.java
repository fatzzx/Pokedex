package pokemoncore;

import pokemon.Pokemon;
import java.util.Comparator;

public class PokemonIdComparator implements Comparator<Pokemon> {
    @Override
    public int compare(Pokemon p1, Pokemon p2) {
        return Integer.compare(p1.getId(), p2.getId());
    }
}