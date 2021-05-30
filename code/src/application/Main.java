package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import static jdk.nashorn.internal.objects.NativeError.printStackTrace;

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
            
        } catch (Exception ex) {
            printStackTrace(ex);
        }
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
