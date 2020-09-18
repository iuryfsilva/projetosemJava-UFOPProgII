package exercicio01;

public class Pessoa {
	
	private String nome, dataDeNascimento, cargo;
	private Universidade universidade; 
	
	// Métodos Especiais
	public Pessoa(String nome, String dataDeNascimento, String cargo, Universidade universidade) {
		//contadorPessoas++;
		this.setNome(nome);
		this.setDataDeNascimento(dataDeNascimento);
		this.setCargo(cargo);
		this.setUniversidade(universidade);
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDataDeNascimento() {
		return this.dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	public String getCargo() {
		return this.cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public Universidade getUniversidade() {
		return this.universidade;
	}
	public void setUniversidade(Universidade universidade) {
		if(this.getUniversidade() == null) {
			this.universidade = universidade;
			this.getUniversidade().setContadorDePessoas(this.getUniversidade().getContadorDePessoas() + 1);
		}else {
			this.getUniversidade().setContadorDePessoas(this.getUniversidade().getContadorDePessoas() - 1);
			this.universidade = universidade;
			this.getUniversidade().setContadorDePessoas(this.getUniversidade().getContadorDePessoas() + 1);
		}
	}

	// Métodos Personalizados
	public void imprimeNomeEUniversidade() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Universidade: " + this.getUniversidade().getNomeUniversidade());
	}
	
	public void imprimeRelatorio() {
		System.out.println(this.getNome() + " trabalhou como " + this.getCargo() + " em " + 
						   this.getUniversidade().getNomeUniversidade() + " (" + this.getUniversidade().getLocalizacao() + ").");
	}
	
}
