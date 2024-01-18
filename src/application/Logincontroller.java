package application;

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

public class Logincontroller {

    // Assuming 'register' is a text element that, when clicked, triggers a registration page transition
    @FXML
    private Text register;
    private EventHandler<MouseEvent> registerHandler;
    private Stage primaryStage;

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void setRegisterHandler(EventHandler<MouseEvent> handler) {
        this.registerHandler = handler;
    }

    // Assuming 'loginButton' triggers a transition to the home page
    @FXML
    private Button login;
    private EventHandler<MouseEvent> loginHandler;

    private Stage primaryStage1;

    public void setPrimaryStage1(Stage primaryStage1) {
        this.primaryStage1 = primaryStage1;
    }

    public void setLoginHandler(EventHandler<MouseEvent> handler) {
        this.loginHandler = handler;
    }

    // Method to switch to the register page scene
    @FXML
   void register(MouseEvent e) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Register.fxml"));
        Parent root = (Parent) loader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Register Page");
        stage.show();
    }

    @FXML
    public void login(MouseEvent e2) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Mainpage.fxml"));
        Parent root = (Parent) loader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) e2.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Home Page");
        stage.show();
    }
}
