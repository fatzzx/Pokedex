package pokemoncore;

import pokemon.Pokemon;
import pokemonfinal.Blastoise;
import pokemonfinal.Bulbasaur;
import pokemonfinal.Charizard;
import pokemonfinal.Charmander;
import pokemonfinal.Charmeleon;
import pokemonfinal.Ivysaur;
import pokemonfinal.Squirtle;
import pokemonfinal.Venusaur;
import pokemonfinal.Wartortle;

import java.util.TreeSet;

public class Pokedex {

	private TreeSet<Pokemon> pokedex = new TreeSet<>(new PokemonIdComparator());
	
	
	public Pokedex() {
		pokedex.add(new Bulbasaur());
		pokedex.add(new Ivysaur());
		pokedex.add(new Venusaur());
		pokedex.add(new Charmander());
		pokedex.add(new Charmeleon());
		pokedex.add(new Charizard());
		pokedex.add(new Squirtle());
		pokedex.add(new Wartortle());
		pokedex.add(new Blastoise());
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
	
	public Integer size() {
		return pokedex.size();
	}
	
	public Pokemon searchPokemonById(Integer id) {
		for(Pokemon pokemon : pokedex) {
			if(pokemon.getId() == id) return pokemon;
		}
		return null;
	}
	
	public Pokemon searchPokemonByName(String name) {
		for(Pokemon pokemon : pokedex) {
			if(pokemon.getName().toLowerCase().contains(name.toLowerCase())) return pokemon;
		}
		return null;
	}
	
	
}