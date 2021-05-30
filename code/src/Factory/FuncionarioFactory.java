package Factory;

import classes.Funcionario;

public interface FuncionarioFactory {
	
	Funcionario criarFuncionario(String id, String password,String nome, String cpf, String email);

}
