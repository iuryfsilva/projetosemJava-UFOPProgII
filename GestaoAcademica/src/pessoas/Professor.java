package pessoas;

public class Professor extends Pessoa{

	private String  titulacao;
	private float salario;
	
	public Professor(String cpf, String titulacao) {
		super(cpf);
		this.setTitulacao(titulacao);
	}
	
 	public String getTitulacao() {
		return this.titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	public float getSalario() {
		return this.salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
}
