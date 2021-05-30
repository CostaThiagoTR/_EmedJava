package controllers;

import java.net.URL;
import java.util.ResourceBundle;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author caios
 */
public class MedicoLoginScreenController implements Initializable{

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private TextField textField;
    @FXML
    private PasswordField passwordField;
    
    //atrs
    String id;
    String password;

    
  //Medico medico = new Medico(id,password);
  //deixar para o banco  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void buttonEntrar(){
    	id = textField.getText();
    	password = passwordField.getText();
    	
    }
    
}
