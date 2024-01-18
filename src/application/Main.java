package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
	    try {
	        FXMLLoader loader = new FXMLLoader(getClass().getResource("Launch.fxml"));
	        Parent root = loader.load();

	        Scene scene = new Scene(root);
	        primaryStage.setTitle("RuralDoctors App");
	        primaryStage.setScene(scene);
	        primaryStage.show(); 

	    } catch(Exception e) {
	        e.printStackTrace();
	    }
	}

	public static void main(String[] args) {
		launch(args);
	}
}
