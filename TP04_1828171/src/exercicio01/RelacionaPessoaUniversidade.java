package exercicio01;

public class RelacionaPessoaUniversidade {

	public static void main(String[] args) {

		Universidade cambridge = new Universidade("Universidade de Cambridge", "Inglaterra");
		Universidade princeton = new Universidade("Universidade de Princeton", "Nova Jersey-Estados Unidos da América");		
		
		Pessoa pessoa1 = new Pessoa("Albert Einstein", "14/3/1879", "professor de física", princeton);	
		Pessoa pessoa2 = new Pessoa("Isaac Newton", "04/1/1643", "professor de matemática", princeton);
		Pessoa pessoa3 = new Pessoa("Iury Silva", "01/08/1994", "engenheiro computacional", cambridge);
		
		System.out.println("=============Relatorio===================");
		pessoa1.imprimeRelatorio();
		pessoa2.imprimeRelatorio();
		pessoa3.imprimeRelatorio();
		
	}

}
