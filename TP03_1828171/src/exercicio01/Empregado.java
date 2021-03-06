package exercicio01;

public class Empregado {
	
	private static int contadorEmpregados = 0;
	private String nomeEmpregado;
	private double salario;
	private float horasTrabalhadas;
	
	//M�todos Especiais
	public Empregado(String nomeEmpregado, double salario){
		contadorEmpregados++;
		this.setNomeEmpregado(nomeEmpregado);
		this.setSalario(salario);
		this.setHorasTrabalhadas(8);
		
	}
	
	public static int getContadorEmpregados() {
		return contadorEmpregados;
	}
	
	public float getHorasTrabalhadas() {
		return this.horasTrabalhadas;
	}
	public void setHorasTrabalhadas(float horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public String getNomeEmpregado() {
		return this.nomeEmpregado;
	}
	public void setNomeEmpregado(String nomeEmpregado) {
		this.nomeEmpregado = nomeEmpregado;
	}
	
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//M�todos Personalizados
	public void printInfo() {
		System.out.println("Nome do empregado: " + this.getNomeEmpregado());
		System.out.println("Sal�rio atual: " + this.getSalario());
		System.out.println("Horas trabalhadas por dia: " + this.getHorasTrabalhadas());	
	}

	public void promocao(double percentualAumento) {
		this.setSalario(((this.getSalario() * percentualAumento) / 100) + this.getSalario());
	}

	public void adicionaGratificacao(double gratificacao) {
		if(this.getHorasTrabalhadas() > 6)
			this.setSalario(this.getSalario() + gratificacao);		
	}

	
}
