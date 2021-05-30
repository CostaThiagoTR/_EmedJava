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
public class Admin extends Funcionario{

    //construtor
    public Admin(String id, String password) {
        super(id, password);
    }
    
    //functions
    void addConta(Funcionario func, Integer type){
        //adiciona conta
    }
    
    void excConta(Funcionario func, Integer type){
        // exclui conta
    }
    
}
