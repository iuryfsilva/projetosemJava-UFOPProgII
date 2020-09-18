package exercicio01;
import exercicio02.Departamento;

public class Universidade {
	
	private int contadorPessoas = 0;
	private String nomeUniversidade;
	private String localizacao;
	
	private Departamento departamentos;
	

	// Métodos Especiais
	public Universidade(String nomeUniversidade, String Localizacao) {
		this.setNomeUniversidade(nomeUniversidade);
		this.setLocalizacao(Localizacao);
	}
	
	public String getNomeUniversidade() {
		return this.nomeUniversidade;
	}
	public void setNomeUniversidade(String nomeUniversidade) {
		this.nomeUniversidade = nomeUniversidade;
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
	
	public Departamento getDepartamentos() {
		return this.departamentos;
	}
	public void setDepartamentos(String nomeDepartamentos) {
		//this.departamentos = new Departamento(nomeDepartamentos, this.getNomeUniversidade());
	}

	
	// Métodos Personalizados


}
