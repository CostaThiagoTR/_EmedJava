package controllers;

import interfaces.uuidFactory;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author caios
 */
public class MainPageController implements uuidFactory{
    
    @FXML
    Button buttonMedico;
    @FXML
    Button buttonFarmaceutico;
    @FXML
    Button buttonAdmin;
    @FXML
    Button buttonSair;
    
    public void clickButtonMedico() throws Exception{
        Parent root = (Parent)FXMLLoader.load(this.getClass().getResource("/fxml/MedicoLoginScreen.fxml"));
        Stage window = (Stage)this.buttonMedico.getScene().getWindow();
        window.setScene(new Scene(root, 1366, 720));
    }
    
    public void clickButtonFarmaceutico(){
        System.out.print("Hello");
    }
    
    public void clickButtonAdmin(){

    }
    
    public void clickButtonSair(){
        System.exit(0);
    }
    
    
}
