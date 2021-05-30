/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author caios
 */
public abstract class Funcionario {
    
    //atributes
    private String id;
    private String password;
    
    //constructor
    public Funcionario(String id, String password){
        this.id = id;
        this.password = password;
    }
    
    //functions
    boolean login(){
        boolean result = false;
        
        return result;
    };
    
    //getters 'n setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
