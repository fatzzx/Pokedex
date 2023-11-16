package aplication;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import pokemon.Pokemon;
import pokemoncore.Pokedex;


public class SearchScreenController {

	private Pokedex pokedex = new Pokedex();
	
	private Integer id;
	
	@FXML 
	private Label error;
	
	@FXML
	private Label pokemonName;
	
	@FXML
	private Label pokemonSpecies;
	
	@FXML
	private Label pokemonId;
	
	@FXML
	private Label pokemonTypes;
	
	@FXML
	private Label pokemonWeakess;
	
	@FXML
	private TextField searchTextField;
	
	@FXML
	private Button searchButton;
	
	@FXML
	private ImageView pokemonImage;
	
	public void submit(ActionEvent event) {
		try {
			id = Integer.parseInt(searchTextField.getText());
			error.setText(null);
			Pokemon pokemon = pokedex.pesquisar(id);
			if(pokemon != null) {
				pokemonName.setText(pokemon.getName());
				pokemonSpecies.setText(pokemon.getSpecies());
				pokemonTypes.setText(pokemon.pokemonTypesString());
				pokemonWeakess.setText(pokemon.pokemonWeaknessString());
				pokemonId.setText(String.format("%d", pokemon.getId()));
				pokemonImage.setImage(pokemon.getImage());
			}
		}catch(Exception e) {
			error.setText("Digite um numero");
		}

	}
	
	
	
	
}
