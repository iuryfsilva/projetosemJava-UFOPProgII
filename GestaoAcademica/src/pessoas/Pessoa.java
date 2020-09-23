package pessoas;

public class Pessoa {

	private String cpf, nome, endereco;

	public Pessoa(String cpf) {
		System.out.println("Chamei o que recebe apenas o cpf");
		this.validaParametros();
		this.cpf = cpf;
	}
	
	public Pessoa(String cpf, String nome) {
		this(cpf); //chama o construtor acima para atribuir o cpf
		System.out.println("Chamei o que recebe o cpf e o nome");
		this.setNome(nome);
	}
	
	public Pessoa(int cpf, String nome) {
		this(String.valueOf(cpf), nome);// chama o construtor acimaque recebe o cpf e o nome 
		System.out.println("Chamei o que recebe o inteiro cpf e o nome");
	}
	
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return this.endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	private void validaParametros() {
		System.out.println("Validando info da pessoa");
	}

	
}
