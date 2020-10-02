package principal;
import pessoas.Professor;
import pessoas.Pessoa;
import componentesCurriculares.Disciplina;
import pessoas.Aluno;
//import pessoas.Aluno;
import pessoas.Monitor;

public class TestaHeranca {

	public static void main(String[] args) {
		
		Pessoa listaDePessoas[] = new Pessoa[3];
		
		Pessoa pessoa = new Professor("00000000", "000000");
		pessoa.setNome("Jão");
		
		listaDePessoas[0] = pessoa;
		
		Disciplina d1 = new Disciplina();
		d1.setNome("CSI032");
		pessoa = new Aluno("2018.2.8171", "Computação", "Iury", "18748565487");
		((Aluno)pessoa).setDisciplina(d1);
		
		listaDePessoas[1] = pessoa;
		
		pessoa = new Monitor("2020.1.0001", "Computacao", "iury", "000000");
		((Monitor)pessoa).setDisciplina(d1);
		((Monitor )pessoa).setDisciplinaMonitorada(d1);	
		
		listaDePessoas[2] = pessoa;

		for (int controle = 0; controle < listaDePessoas.length; controle++)
			listaDePessoas[controle].escrveObjetoNaTela();
		
	}

}
