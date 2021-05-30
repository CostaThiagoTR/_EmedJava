package application;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author caios
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
    	
        try {      
            Parent root = (Parent)FXMLLoader.load(this.getClass().getResource("/fxml/MainPage.fxml"));
            Scene scene = new Scene(root, 1366.0D, 720.0D);
            primaryStage.setScene(scene);
            primaryStage.setTitle("E Med");
            primaryStage.show();
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
