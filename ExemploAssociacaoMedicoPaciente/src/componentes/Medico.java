package componentes;

public class Medico {

	private String nome, especialidade;
	
	public Medico(String nome, String especialidade) {
		this.setNome(nome);
		this.setEspecialidade(especialidade);
	}

	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return this.especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	
	
}
