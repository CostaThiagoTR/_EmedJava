package Factory;

import classes.Medico;

public class MedicoFactory implements FuncionarioFactory{

	@Override
	public Medico criarFuncionario(String id, String password,String nome, String cpf, String email) {
		
		return new Medico(id, password, nome, cpf, email);
	}
	
	
	

}
