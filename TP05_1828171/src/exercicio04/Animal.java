package exercicio04;

public class Animal {

	private String nome, raca;

	
	public Animal() {
		this.setNome("Poppy");
	}
	public Animal(String nome) {
		this.setNome(nome);
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return this.raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public String caminha() {
		return "Caminhando";
	}
	
		
}
