package exercicio06;

public class Bicicleta extends Veiculo{

	private float velocidade;
	
	public Bicicleta() {
		this.velocidade = 0;
	}
	
	public float getVelocidade() {
		return this.velocidade;
	}
	
	@Override
	public float acelerar(float velocidade) {
		this.velocidade = this.velocidade + velocidade;
		return this.velocidade;
	}

	@Override
	public void parar() {
		this.velocidade = 0;
	}

}
