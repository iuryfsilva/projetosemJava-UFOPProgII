package exercicio06;

public class Rica extends Pessoa{

	private double dinheiro;
	
	public double getDinheiro() {
		return this.dinheiro;
	}
	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}

	public void fazCompras() {
		if(this.getDinheiro() > 0)
			System.out.println("Comprando...");
		else 
			System.out.println("Não tem dinheiro");
	}

}
