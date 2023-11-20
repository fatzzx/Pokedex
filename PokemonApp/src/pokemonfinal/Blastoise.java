package pokemonfinal;

import java.util.ArrayList;
import java.util.Arrays;

import pokemon.Pokemon;
import pokemon.PokemonType;

public final class Blastoise extends Pokemon {

    public Blastoise() {
        super("Blastoise", "Blastoise", "Pokémon Tartaruga Gigante", 9,
                new ArrayList<>(Arrays.asList(PokemonType.AGUA)),
                new ArrayList<>(Arrays.asList(PokemonType.ELETRICO, PokemonType.GRAMA, PokemonType.GELO)),
                Blastoise.class.getResource("/images/Blastoise.png").toString());
    }

    @Override
    public String description() {
        return "Blastoise é a forma final de evolução da linha Squirtle. Sua concha agora se transformou em canhões de água poderosos, tornando-o uma força a ser reconhecida."
                + "\n"
                + "Este Pokémon de tipo Água é respeitado por sua incrível potência de ataque e defesa. Blastoise é capaz de disparar jatos d'água com força suficiente para derrubar construções";
        }
}
