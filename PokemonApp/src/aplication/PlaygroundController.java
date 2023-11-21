package aplication;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;
import pokemon.Pokemon;
import pokemoncore.Pokedex;

public class PlaygroundController implements Initializable{

	private Stage stage;
	private Scene scene;
	
	@FXML
	private Button backButton;
	
	@FXML
	private Button removeButton;
	
	@FXML
	private Button addButton;
	
	@FXML
	private ChoiceBox<String> choiceBox;
	
	@FXML
	private Pane pokemonPane;
	
	private Pokedex pokedex = new Pokedex();
	
	private ArrayList<ImageView> pokemonInPlayground = new ArrayList<ImageView>();
	
			
	
    public void switchToMenuScreen(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void addPokemonToPlayground(ActionEvent event) {
        if (choiceBox.getValue() != null) {
            Pokemon pokemon = pokedex.searchPokemonByName(choiceBox.getValue());
            if (pokemon != null) {
                ImageView pokemonImageView = new ImageView(pokemon.getImage());
                pokemonImageView.setFitWidth(50);
                pokemonImageView.setFitHeight(50);
                pokemonImageView.setX(197);
                pokemonImageView.setY(250);
                pokemonInPlayground.add(pokemonImageView);
                animatePokemon(pokemonImageView);
                pokemonPane.getChildren().add(pokemonImageView);
            }
        }
    }

    
    public void removePokemonInPlayground(ActionEvent event) {
        if (choiceBox.getValue() != null) {
            Pokemon pokemon = pokedex.searchPokemonByName(choiceBox.getValue());
            if (pokemon != null) {
                ImageView pokemonImageViewToRemove = null;
                for (ImageView imageView : pokemonInPlayground) {
                    if (imageView.getImage().equals(pokemon.getImage())) {
                        pokemonImageViewToRemove = imageView;
                        break;
                    }
                }
                if (pokemonImageViewToRemove != null) {
                    pokemonPane.getChildren().remove(pokemonImageViewToRemove);
                    pokemonInPlayground.remove(pokemonImageViewToRemove);
                }
            }
        }
    }


    private void animatePokemon(ImageView pokemonImageView) {
        TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(10), pokemonImageView);
        translateTransition.setToX(320);   
        translateTransition.setAutoReverse(true);
        translateTransition.setCycleCount(TranslateTransition.INDEFINITE);
        translateTransition.play();
    }


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		for(Pokemon pokemon : pokedex.getPokedex()) {
			choiceBox.getItems().add(pokemon.getName());
		}
	}
	
	
}
