package exercicio01;
import exercicio02.Departamento;

public class RelacionaPessoaUniversidade {

	public static void main(String[] args) {

		Universidade cambridge = new Universidade("Universidade de Cambridge", "Inglaterra");
		Universidade princeton = new Universidade("Universidade de Princeton", "Nova Jersey-Estados Unidos da América");		
		
		Pessoa pessoa1 = new Pessoa("Albert Einstein", "14/3/1879", "professor de física", princeton);	
		Pessoa pessoa2 = new Pessoa("Isaac Newton", "04/1/1643", "professor de matemática", princeton);
		Pessoa pessoa3 = new Pessoa("Iury Silva", "01/08/1994", "engenheiro computacional", cambridge);
		
		Departamento engenharia = new Departamento("Engenharia");
		Departamento sociologia = new Departamento("Sociologia");
		Departamento letras = new Departamento("Letras");
		
		
		System.out.println("===============================Relatorio===================================");
		pessoa1.imprimeRelatorio();
		pessoa2.imprimeRelatorio();
		pessoa3.imprimeRelatorio();
		System.out.println("===========================================================================");
		
		princeton.addDepartamento(engenharia);
		princeton.addDepartamento(sociologia);
		princeton.addDepartamento(letras);
		cambridge.imprimirDepartamentosUniversidade();
		princeton.imprimirDepartamentosUniversidade();
		pessoa1.setDepartamentoPessoa(engenharia);
		pessoa1.imprimeNomeEUniversidade();
		pessoa2.imprimeNomeEUniversidade();

		
		
	}

}
