package Factory;

import classes.Farmaceutico;
import classes.Medico;

public class FarmaceuticoFactory implements FuncionarioFactory{

	@Override
	public Farmaceutico criarFuncionario(String crf, String password,String nome, String cpf, String email) {
		
		return new Farmaceutico(crf, password, nome, cpf, email);
	}

}
