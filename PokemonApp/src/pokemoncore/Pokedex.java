package pokemoncore;

import pokemon.Pokemon;
import pokemonfinal.Charmander;

import java.util.TreeSet;

public class Pokedex {

	private TreeSet<Pokemon> pokedex = new TreeSet<>(new PokemonIdComparator());
	
	
	public Pokedex() {
		pokedex.add(new Charmander());
	}

	public TreeSet<Pokemon> getPokedex() {
		return pokedex;
	}

	public void setPokedex(TreeSet<Pokemon> pokedex) {
		this.pokedex = pokedex;
	}
	
	public void addPokemon(Pokemon pokemon) {
		pokedex.add(pokemon);
	}
	
	public Boolean removePokemon(Pokemon pokemon) {
		return pokedex.remove(pokemon);
	}
	
	public Pokemon pesquisar(Integer id) {
		for(Pokemon pokemon : pokedex) {
			if(pokemon.getId() == id) return pokemon;
		}
		return null;
	}
	
}