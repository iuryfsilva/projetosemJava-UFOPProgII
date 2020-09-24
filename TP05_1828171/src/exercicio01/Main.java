package exercicio01;

public class Main {

	public static void main(String[] args) {
		
		Lampada lamp[] = new Lampada[5];
		
		for(int controle = 0; controle < lamp.length; controle++) {
			lamp[controle] = new Lampada(controle * 20);			
		}
		
		lamp[1].ajusteLuminosidade(75.45f);
		
		for(int controle = 0; controle < lamp.length; controle++) {
			System.out.printf("\nLuminosidade da lampada%d \n %.2f", controle, lamp[controle].getLuminosidade());
			System.out.printf("\nEstado da lampada%d \n %s\n", controle, lamp[controle].getEstado());
			System.out.printf("\nPotência da lampada%d \n %d\n", controle, lamp[controle].getPotencia());
			System.out.println("Quantidade de vezes que foi ligada: " + lamp[controle].getQuantasVezesFoiLigada());
			System.out.println("Está ligada: " + lamp[controle].estaLigada());
			System.out.println("É economica: " + lamp[controle].eEconomica());
		}
		System.out.println("Quantidade de lampadas criadas: " + Lampada.contadorDeLampadasCriadas());
	}

}
