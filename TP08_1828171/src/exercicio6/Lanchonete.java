package exercicio6;

public class Lanchonete{

	public static Sanduiche factorySanduiche(SanduichesIngredientFactory fabrica) {
		if(fabrica.equals("SanduichesIngredientFactoryCG"))
			return new Sanduiche("Integral", "Prato", "De Peru", false);
		else if(fabrica.equals("SanduichesIngredientFactoryJP"))
			return new Sanduiche("Francês", "Mussarela", "De Frango", true);
		else 
			return new Sanduiche("Bola", "Cheddar", "De Peru", false);
	}
}
