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
public class Medico extends Funcionario{

	private int crm;
	private String password;

    //construtor
    public Medico(String crm, String password,String nome, String cpf, String email) {
        super(nome,cpf,email);
    }
    
    //functions
    public void solicitaMedicamento(String idMed, Integer quant){
        //executa solicitamento    
    }
    
	@Override
    boolean login(String crm,String password){
        boolean result = false;
        //consulta banco de dados e verifica ha login
        
        return result;
    }

	public int getCrm() {
		return crm;
	}

	public void setCrm(int crm) {
		this.crm = crm;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	};
    
}
