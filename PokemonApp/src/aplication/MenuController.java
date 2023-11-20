package aplication;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MenuController {

	private Stage stage;
	private Scene scene;
	
	@FXML
	private Button button;
	
	@FXML
	private Button playgroundButton;
	
    public void switchToSearchScreen(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("SearchScreen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void switchToPlaygroundScreen(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Playground.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
}