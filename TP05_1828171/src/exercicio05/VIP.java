package exercicio05;

public class VIP extends Ingresso{

	private double valorAdicional;

	public double getValorAdicional() {
		return this.valorAdicional;
	}
	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	public double valorIngressoComAdicional() {
		return super.getValor() + this.getValorAdicional();
	}
}
