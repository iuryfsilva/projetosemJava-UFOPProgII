package exercicio01;

public class Universidade {
	
	private int contadorPessoas = 0;
	private String nome;
	private String localizacao;

	// Métodos Especiais
	public Universidade(String nome, String Localizacao) {
		this.setNome(nome);
		this.setLocalizacao(Localizacao);
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getLocalizacao() {
		return this.localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	public int getContadorDePessoas() {
		return this.contadorPessoas;
	}
	public void setContadorDePessoas(int contadorDePessoas) {
		this.contadorPessoas = contadorDePessoas;
	}
	// Métodos Personalizados


}
