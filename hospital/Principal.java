package hospital;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		Endereco end1 = new Endereco();
		end1.rua = "Rua A";
		end1.cidade = "Porto Alegre";
		end1.bairro = "Centro";
		end1.cep = "000";
		
		Medico mend1 = new Medico();
		mend1.endereco = end1;
		
		System.out.println("O médico mora na rua"+mend1.endereco.rua);
		
		// Pegando a data atual
		LocalDate hoje = LocalDate.now();
		// Definido a partir de uma data específica
		LocalDate especifica = LocalDate.of(1991,9, 6);
		
		
		
	
		
	}

}
