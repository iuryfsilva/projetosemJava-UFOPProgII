package exercicio06;

public class TestaClasses {

	public static void main(String[] args) {

		Rica milionario = new Rica();
		milionario.setNome("Jão");
		milionario.setIdade(26);
		milionario.setDinheiro(1000000);
		System.out.println("Nome: " + milionario.getNome());
		System.out.println("Idade: " + milionario.getIdade());
		System.out.println("Saldo: " + milionario.getDinheiro());
		milionario.fazCompras();
		
		Pobre trabalhadorBrasileiro = new Pobre();
		trabalhadorBrasileiro.setNome("Charles");
		trabalhadorBrasileiro.setIdade(22);
		System.out.println("Nome: " + trabalhadorBrasileiro.getNome());
		System.out.println("Idade: " + trabalhadorBrasileiro.getIdade());
		trabalhadorBrasileiro.trabalha();
		
		Miseravel mendigo = new Miseravel();
		mendigo.setNome("Ruthenberg");
		mendigo.setIdade(42);
		System.out.println("Nome: " + mendigo.getNome());
		System.out.println("Idade: " + mendigo.getIdade());
		mendigo.mendiga();
		
	}

}
