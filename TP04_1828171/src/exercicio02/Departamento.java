package exercicio02;
import exercicio01.Universidade;

public class Departamento {
	private String nomeDepartamento;
	private Universidade referenciaUniversidade;
	
 	public Departamento(String nomeDepartamento, Universidade referenciaUniversidade) {
		this.setNomeDepartamento(nomeDepartamento);
		this.referenciaUniversidade = referenciaUniversidade;
	}

	public String getNomeDepartamento() {
		return this.nomeDepartamento;
	}
	public void setNomeDepartamento(String nomeDepartamento) {
		this.nomeDepartamento = nomeDepartamento;
	}
	
	public void imprimeUniversidadeAqualPertence() {
		System.out.println("Universidade aqua pertence: " + this.referenciaUniversidade.getNomeUniversidade());
	}
	
	
	
}
