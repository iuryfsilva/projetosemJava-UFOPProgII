package exercicio02;
import exercicio01.Lampada;

public class LampadaFlourescente extends Lampada{
	
	private float comprimento;
	
	public LampadaFlourescente(float luminosidade, int potencia, float comprimento) {
		super();
		super.ajusteLuminosidade(luminosidade);
		super.setPotencia(potencia);
		this.setComprimento(comprimento);
	}
	
	public float getComprimento() {
		return this.comprimento;
	}
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}

	
}
