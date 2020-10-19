package firma;

public class Empregado {

	private String nome;
	private String sobrenome;
	private double salarioMensal;
	
	public Empregado(String nome, String sobrenome, double salarioMensal) {
		this.setNome(nome);
		this.setSobrenome(sobrenome);
		this.setSalarioMensal(salarioMensal);
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return this.sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public double getSalarioMensal() {
		return this.salarioMensal;
	}	
	public void setSalarioMensal(double salarioMensal) {
		if(salarioMensal < 0.0){
			this.salarioMensal = 0.0;
		}else{
			this.salarioMensal = salarioMensal;
		}
	}
	
	
	
}
