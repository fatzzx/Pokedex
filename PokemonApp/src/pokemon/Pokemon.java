package pokemon;

import java.util.ArrayList;
import javafx.scene.image.Image;

public abstract class Pokemon implements Description {
	
	private String name;
	private String nickname;
	private String species;
	private Integer id;
    private Image image;
	ArrayList<PokemonType> types = new ArrayList<>();
	ArrayList<PokemonType> weaknesses = new ArrayList<>();
    
    public Pokemon(String name, String nickname, String species, Integer id, ArrayList<PokemonType> types,
                   ArrayList<PokemonType> weaknesses, String imagePath) {
        this.name = name;
        this.nickname = nickname;
        this.species = species;
        this.id = id;
        this.types = types;
        this.weaknesses = weaknesses;
        try {
            this.image = new Image(imagePath);
        } catch (Exception e) {
            System.err.println("Erro ao carregar a imagem para " + name + ": " + e.getMessage());
        }  
    }
    
	public Pokemon() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public ArrayList<PokemonType> getTypes() {
		return types;
	}

	public void setTypes(ArrayList<PokemonType> types) {
		this.types = types;
	}

	public ArrayList<PokemonType> getWeaknesses() {
		return weaknesses;
	}

	public void setWeaknesses(ArrayList<PokemonType> weaknesses) {
		this.weaknesses = weaknesses;
	}
	
	public String pokemonTypesString() {
		StringBuilder sb = new StringBuilder();
		for(PokemonType type : types) {
			sb.append(type.name() + ", ");
		}
	    if (sb.length() > 0) {
	        sb.setLength(sb.length() - 2);
	    }
		return sb.toString();
	}
	
	public String pokemonWeaknessString() {
		StringBuilder sb = new StringBuilder();
		for(PokemonType type : weaknesses) {
			sb.append(type.name() + ", ");
		}
	    if (sb.length() > 0) {
	        sb.setLength(sb.length() - 2);
	    }
		return sb.toString();
	}


}
