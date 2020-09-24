package exercicio05;

public class CamaroteSuperior extends VIP{

	private double valorAdicionalCamaroteSuperior;

	public double getvalorAdicionalCamaroteSuperior() {
		return this.valorAdicionalCamaroteSuperior;
	}
	public void setvalorAdicionalCamaroteSuperior(double valorAdicionalCamaroteSuperior) {
		this.valorAdicionalCamaroteSuperior = valorAdicionalCamaroteSuperior;
	}
	
	public double valorIngressoComAdicionalCamaroteSuperior() {
		return super.getValor() + super.getValorAdicional() + this.getvalorAdicionalCamaroteSuperior();  
	}
	
}
