package principal;
import componentesCurriculares.Disciplina;
import pessoas.Aluno;

public class TesteReferencia {

	public static void main(String[] args) {
		
		Aluno iury = new Aluno("2020.1.0001", "Computacao", "iury", "000000");
		
		iury.setDisciplina(new Disciplina());
		iury.getDisciplina().setNome("CEA138");
		iury.setDisciplina(new Disciplina());
		iury.getDisciplina().setNome("CEA032");

		System.out.println(iury.getDisciplina().getNome());
		
	}

}
