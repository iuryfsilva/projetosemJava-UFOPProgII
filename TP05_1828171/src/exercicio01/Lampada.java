package exercicio01;

public class Lampada {
	
	private static int contadorDeLampadasCriadas = 0;
	private String estado;
	private float luminosidade;
	private int potencia;
	private int quantasVezesFoiLigada;

	public Lampada(int Potencia) {
		this.setPotencia(Potencia);
		this.ajusteLuminosidade(0);
		contadorDeLampadasCriadas++;
	}
	public Lampada() {
		this(60);
	}
	
	public String getEstado() {
		return this.estado;
	}
	public void setEstado(String estado) {
		if(this.getEstado()== "apagada") {
			if(estado.equals("acesa") || estado.equals("meia-luz"))
				this.setQuantasVezesFoiLigada(this.getQuantasVezesFoiLigada() + 1);
		}
		this.estado = estado;
	}

	public float getLuminosidade() {
		return this.luminosidade;
	}
	public void setLuminosidade(float luminosidade) {
		if(this.getEstado().equals("apagada"))
			this.luminosidade = 0;
		else
			this.luminosidade = luminosidade;
	}

	public int getPotencia() {
		return this.potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	public int getQuantasVezesFoiLigada() {
		return this.quantasVezesFoiLigada;
	}
	private void setQuantasVezesFoiLigada(int quantasVezesFoiLigada) {
		this.quantasVezesFoiLigada = quantasVezesFoiLigada;
	}
	
	public void ajusteLuminosidade(float valorAjuste) {
		if(valorAjuste == 0) {
			this.setEstado("apagada");
			this.setLuminosidade(valorAjuste);
		}else if(valorAjuste < 100 && valorAjuste > 0) {
			this.setEstado("meia-luz");
			this.setLuminosidade(valorAjuste);
		}else if(valorAjuste == 100) {
			this.setEstado("acesa");
			this.setLuminosidade(valorAjuste);
		}
		
	}
	
	public boolean estaLigada() {
		if(this.getEstado().equals("apagada"))
			return false;
		else
			return true;
	}
	
	public boolean eEconomica() {
		if(this.getPotencia() < 40)
			return true;
		else
			return false;
	}
	
	public static int contadorDeLampadasCriadas() {
		return contadorDeLampadasCriadas;
	}
	
}
