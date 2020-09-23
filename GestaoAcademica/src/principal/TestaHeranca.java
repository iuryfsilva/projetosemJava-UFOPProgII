package principal;
import pessoas.Professor;
import pessoas.Pessoa;
//import pessoas.Aluno;
import pessoas.Monitor;

public class TestaHeranca {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("00000000");
		System.out.println(p1.getNome());
		System.out.println(p1.getCpf());
		
		Pessoa p2 = new Pessoa("00000000", "ashgadgashg");
		System.out.println(p2.getNome());
		System.out.println(p2.getCpf());
		
		Pessoa p3 = new Pessoa(123456889, "ze");
		System.out.println(p3.getNome());
		System.out.println(p3.getCpf());
		
		Professor prof1 = new Professor("00000000", "000000");
		
		prof1.setNome("Jão");

		Monitor monitor1 = new Monitor("2020.1.0001", "Computacao", "iury", "000000");
		
		
		
	}

}
