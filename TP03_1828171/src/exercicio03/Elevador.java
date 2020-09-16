package exercicio03;

public class Elevador {
	
	private int andarAtual, totalDeAndaresDoPredio, capacidadeElevador, quantidadePessoasNoElevador;
	
	//Métodos Especiais

	public int getAndarAtual() {
		return this.andarAtual;
	}
	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}
	
	public int getTotalDeAndaresDoPredio() {
		return this.totalDeAndaresDoPredio;
	}
	public void setTotalDeAndaresDoPredio(int totalDeAndaresDoPredio) {
		this.totalDeAndaresDoPredio = totalDeAndaresDoPredio;
	}

	public int getCapacidadeElevador() {
		return this.capacidadeElevador;
	}
	public void setCapacidadeElevador(int capacidadeElevador) {
		this.capacidadeElevador = capacidadeElevador;
	}

	public int getQuantidadePessoasNoElevador() {
		return this.quantidadePessoasNoElevador;
	}
	public void setQuantidadePessoasNoElevador(int quantidadePessoasNoElevador) {
		this.quantidadePessoasNoElevador = quantidadePessoasNoElevador;
	}
	
	//Métodos Personalizados
	public void inicializa(int capacidadeElevador, int totalDeAndaresDoPredio) {
		this.setCapacidadeElevador(capacidadeElevador);
		this.setAndarAtual(0);
		this.setQuantidadePessoasNoElevador(0);
		this.setTotalDeAndaresDoPredio(totalDeAndaresDoPredio + 1);
	}

	public void entra() {
		if(this.getQuantidadePessoasNoElevador() < this.getCapacidadeElevador()) 
			this.setQuantidadePessoasNoElevador(this.getQuantidadePessoasNoElevador() + 1);
	}
	public void sai() {
		if(0 < this.getQuantidadePessoasNoElevador())
			this.setQuantidadePessoasNoElevador(this.getQuantidadePessoasNoElevador() - 1);
	}
	
	//sobe até o ultimo andar
	public void sobe() {
		if((this.getAndarAtual() >= 0) && (this.getAndarAtual() <= this.getTotalDeAndaresDoPredio())) {
			this.setAndarAtual(this.getAndarAtual() + 1);
		}
	}
	//desce ate o terreo
	public void desce() {
		if((this.getAndarAtual() > 0) && (this.getAndarAtual() <= this.getTotalDeAndaresDoPredio())) {
			this.setAndarAtual(this.getAndarAtual() - 1);
		}
	}
	
}
