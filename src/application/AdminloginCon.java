package application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXML;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.Node;

public class AdminloginCon {

	@FXML
	void gotomain(MouseEvent e) throws IOException {
		  
		        FXMLLoader loader = new FXMLLoader(getClass().getResource("Adminmain.fxml"));
		        Parent root = (Parent) loader.load();
		        Scene scene = new Scene(root);
		        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
		        stage.setScene(scene);
		        stage.setTitle("Home Page");
		        stage.show();
	    
	}
	
	
}
