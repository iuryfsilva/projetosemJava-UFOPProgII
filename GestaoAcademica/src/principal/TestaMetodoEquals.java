package principal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import pessoas.Pessoa;
import pessoas.Professor;

public class TestaMetodoEquals {

	public static void main(String[] args) {

		Set<Pessoa> listaDePessoas = new HashSet<Pessoa>();
		
		Pessoa prof1 = new Professor("000", "Doutor");
		Pessoa prof2 = new Professor("122", "Mestre");
		
		listaDePessoas.add(prof1);
		
		//if(listaDePessoas.contains(prof2))
			listaDePessoas.add(prof2);
		
		for(Pessoa pessoa: listaDePessoas) {
			pessoa.escrveObjetoNaTela();
		}
		
	}
}
