package componentes;

public class Paciente {

	private String nome, cpf;
	private int cadastro;
	
	public Paciente(String nome, String cpf, int cadastro) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setCadastro(cadastro);
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	

	public int getCadastro() {
		return this.cadastro;
	}

	public void setCadastro(int cadastro) {
		this.cadastro = cadastro;
	}
	
}
