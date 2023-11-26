package aplication;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import pokemon.Pokemon;
import pokemoncore.Pokedex;


public class SearchScreenController {

	private Pokedex pokedex = new Pokedex();
	private Stage stage;
	private Scene scene;
	
	private Integer id = 0;
	
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
	private Button leftButton;
	
	@FXML
	private Button rightButton;
	
	@FXML
	private Button backButton;
	
	@FXML
	private ImageView pokemonImage;
	
    public void switchToMenuScreen(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
	
	public void showsOnScreen() {
		error.setText(null);
		Pokemon pokemon = pokedex.searchPokemonById(id);
		if(pokemon != null) {
			pokemonName.setText("Nome: " + pokemon.getName());
			pokemonSpecies.setText("Espécie: " + pokemon.getSpecies());
			pokemonTypes.setText("Tipo: " + pokemon.pokemonTypesString());
			pokemonWeakess.setText("Fraquezas: " + pokemon.pokemonWeaknessString());
			pokemonId.setText("Id: " +  String.format("%d", pokemon.getId()));
			pokemonImage.setImage(pokemon.getImage());
		}
	}
	
	public void submit(ActionEvent event) {
		try {
			Integer aux = Integer.parseInt(searchTextField.getText());
			if(aux > 0 && aux < pokedex.size()) id = aux;
			showsOnScreen();
		}catch(Exception e) {
			error.setText("Digite um numero");
		}
	}
	
	public void nextPokemon(ActionEvent event) {
		if(id < pokedex.size()) {
			id++;
			showsOnScreen();	
		}
	}
	
	public void previousPokemon(ActionEvent event) {
		if(id > 1) {
			id--;
			showsOnScreen();			
		}
	}
}
