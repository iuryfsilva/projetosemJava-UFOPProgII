package exercicio01;
import exercicio02.Departamento;

public class RelacionaPessoaUniversidade {

	public static void main(String[] args) {

		Universidade cambridge = new Universidade("Universidade de Cambridge", "Inglaterra");
		Universidade princeton = new Universidade("Universidade de Princeton", "Nova Jersey-Estados Unidos da Am�rica");		
		Departamento computacao = new Departamento("Computacao");
		Universidade ufop = new Universidade("UFOP", "Jo�o Monlevade-Brazil", computacao);
		
		Departamento engenharia = new Departamento("Engenharia");
		Departamento sociologia = new Departamento("Sociologia");
		Departamento letras = new Departamento("Letras");
		Departamento matematica = new Departamento("Matem�tica");

		
		Pessoa pessoa1 = new Pessoa("Albert Einstein", "14/3/1879", "professor de f�sica", princeton, engenharia);	
		Pessoa pessoa2 = new Pessoa("Isaac Newton", "04/1/1643", "professor de matem�tica", princeton, matematica);
		Pessoa pessoa3 = new Pessoa("Iury Silva", "01/08/1994", "engenheiro computacional", cambridge);
		
		
		Pessoa pessoa4 = new Pessoa("Eduarda Jilliard", "20/05/1996", "tecnica em controle e automa��o", ufop, letras);
		
		
		
		
		
		System.out.println("===============================Relatorio===================================");
		pessoa1.imprimeRelatorio();
		pessoa2.imprimeRelatorio();
		pessoa3.imprimeRelatorio();
		pessoa4.imprimeRelatorio();
		System.out.println("===========================================================================");
		

		princeton.addDepartamento(sociologia);
		princeton.addDepartamento(letras);
		cambridge.imprimeDepartamentosUniversidade();
		princeton.imprimeDepartamentosUniversidade();
		pessoa1.setDepartamentoPessoa(engenharia);
		pessoa1.imprimeNomeEUniversidade();
		pessoa2.imprimeNomeEUniversidade();

		
		
	}

}
