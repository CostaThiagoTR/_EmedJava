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

	private String username;
	private String password;
	
    //construtor
    public Admin(String username, String password,String nome, String cpf, String email) {
        super(nome,cpf,email);
    }
    
    //functions
    void addConta(Funcionario func, Integer type){
        //adiciona conta
    }
    
    void excConta(Funcionario func, Integer type){
        // exclui conta
    }
    
}
