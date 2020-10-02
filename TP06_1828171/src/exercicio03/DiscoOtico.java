package exercicio03;

public class DiscoOtico extends Dispositivo{//A classe DiscoOtico não possui um construtor 
											//explicito que é necessaria para receber os parametros que a classe mãe necessita
	public DiscoOtico(String n, long c) {
		super(n, c);
	}
	
	@Override
	public String toString() {
		return null;
	}

	@Override
	public double capacidadeEmMegabytes() {
		return 0;
	}

}
