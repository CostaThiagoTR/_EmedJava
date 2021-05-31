package Factory;

import classes.Medico;

public class MedicoFactory implements FuncionarioFactory{

	@Override
	public Medico criarFuncionario(String crm, String password,String nome, String cpf, String email) {
		
		return new Medico(crm, password, nome, cpf, email);
	}
	
	
	

}
