package exercicio02;

import exercicio01.Lampada;

public class Main {

	public static void main(String[] args) {
		
		LampadaFlourescente lamp = new LampadaFlourescente(100, 55, 11.5f);
		System.out.println("Luminosidade da lampada: " + lamp.getLuminosidade());
		System.out.println("Estado da lampada: " + lamp.getEstado());
		System.out.println("Potência da lampada:" + lamp.getPotencia());
		System.out.println("Quantidade de vezes que foi ligada: " + lamp.getQuantasVezesFoiLigada());
		System.out.println("Comprimento da lampada: " + lamp.getComprimento());
		System.out.println("Está ligada: " + lamp.estaLigada());
		System.out.println("É economica: " + lamp.eEconomica());
		System.out.println("Quantidade de lampadas criadas: " + Lampada.contadorDeLampadasCriadas());

		
	}

}
