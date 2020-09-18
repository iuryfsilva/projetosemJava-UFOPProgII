package exercicio02;
import exercicio01.Universidade;

public class Departamento {
	private String nomeDepartamento;
	private Universidade referenciaUniversidade;
	
 	public Departamento(String nomeDepartamento, Universidade referenciaUniversidade) {
		this.setNomeDepartamento(nomeDepartamento);
		this.setReferenciaUniversidade(referenciaUniversidade);
	}
 	public Departamento(String nomeDepartamento) {
		this.setNomeDepartamento(nomeDepartamento);
	}

	public String getNomeDepartamento() {
		return this.nomeDepartamento;
	}
	public void setNomeDepartamento(String nomeDepartamento) {
		this.nomeDepartamento = nomeDepartamento;
	}
	
	public Universidade getReferenciaUniversidade() {
		return this.referenciaUniversidade;
	}
	public void setReferenciaUniversidade(Universidade referenciaUniversidade) {
		this.referenciaUniversidade = referenciaUniversidade;
	}
	
	public void imprimeUniversidadeAqualPertence() {
		System.out.println("Universidade aqual pertence: " + this.referenciaUniversidade.getNomeUniversidade());
	}


	
	
	
}
