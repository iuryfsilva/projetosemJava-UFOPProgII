package exercicio4;

public class LanchoneteFactory {

	public static Sanduiche factorySanduiche(String escolha) {
		if(escolha.equalsIgnoreCase("CG"))
			return new Sanduiche("Integral", "Prato", "De Peru", false);
		else if(escolha.equalsIgnoreCase("JP"))
			return new Sanduiche("Francês", "Mussarela", "De Frango", true);
		else 
			return new Sanduiche("Bola", "Cheddar", "De Peru", false);
	}
	
}
