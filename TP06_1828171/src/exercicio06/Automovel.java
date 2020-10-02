package exercicio06;

public class Automovel extends Veiculo{

	private float oleo;
	private float velocidade;
	
	public Automovel() {
		this.velocidade = 0;
		this.oleo = 0;
	}
	
	public float getVelocidade() {
		return this.velocidade;
	}
	
	public void trocarOleo(float litros) {
		if(this.oleo < 1) {
			System.out.printf("Realizando a troca de oleo, volume adicionado no reservatório: %.2f L\n", litros);
			this.oleo = litros;
		}else {
			System.out.printf("Não pode fazer troca ainda. \nQuantidade de Oleo: %.2f L\n", this.oleo);
		}
	}

	@Override
	public float acelerar(float velocidade) {
		if(this.oleo > 0) {
			this.velocidade = this.velocidade + velocidade;
			this.oleo -= 1;
			return this.velocidade;
		}else {
			System.out.println("O automovel não pode acelerar sem oleo no motor!");
			return this.velocidade = 0;
		}
	}

	@Override
	public void parar() {
		this.velocidade = 0;
		this.oleo -= 1;
	}
	
}
