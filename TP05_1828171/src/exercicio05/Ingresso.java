package exercicio05;

public class Ingresso {

	private double valor;
	
	public double getValor() {
		return this.valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void imprimeValor() {
		System.out.println("R$ " + this.getValor());
	}


}
