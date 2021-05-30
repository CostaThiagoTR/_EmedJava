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
public class Farmaceutico extends Funcionario{
	
	private int crf;
	private String password;

    //construtor
    public Farmaceutico(String crf, String password,String nome, String cpf, String email) {
        super(nome,cpf,email);
    }
    
    //functions
    @Override
    boolean login(String crf,String password){
        boolean result = false;
        //consulta banco de dados e verifica ha login
        
        return result;
    }
    
    
    public void cadastraMedicamento(Medicamento med){
        //executa cadastramento
        
    }

	public int getCrf() {
		return crf;
	}

	public void setCrf(int crf) {
		this.crf = crf;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
    
}
