package exercicio03;

public class Empresa {
	
	private String nome, endereco, cidade, estado;
	private int telefone, cep;
	
	// Métodos Especiais
	public Empresa() {
		this.setNome("Nova empresa");
		this.setEndereco("Rua das mangueiras");
		this.setCidade("Goyabopolis");
		this.setEstado("Abobrinha do sul");
		this.setTelefone(0000000);
		this.setCep(999999);
	}
	
	public Empresa(String nome, String endereco,String cidade, 
				   String estado, int telefone, int cep) {
		this.setNome(nome);
		this.setEndereco(endereco);
		this.setCidade(cidade);
		this.setEstado(estado);
		this.setTelefone(telefone);
		this.setCep(cep);
	}

	public String getNome() {
		return this.nome;
	}
	public void printNome() {
		System.out.println("Nome empresa: " + this.getNome());
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return this.endereco;
	}
	public void printEnderec() {
		System.out.println("Endereço: " + this.getEndereco());
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return this.cidade;
	}
	public void printCidade() {
		System.out.println("Cidade: " + this.getCidade());
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return this.estado;
	}
	public void printEstado() {
		System.out.println("Estado: " + this.getEstado());
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getTelefone() {
		return this.telefone;
	}
	public void printTelefone() {
		System.out.println("Telefone: " + this.getTelefone());
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getCep() {
		return this.cep;
	}
	public void printCep() {
		System.out.println("CEP: " + this.getCep());	
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	
	
}
