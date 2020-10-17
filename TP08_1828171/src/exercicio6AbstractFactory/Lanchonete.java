package exercicio6AbstractFactory;

public class Lanchonete extends SanduicheFactory{

	@Override
	public void montarSanduiche(SanduichesIngredientFactory fabrica) {
		if(SanduichesIngredientFactoryCG.class.getSimpleName().equals(fabrica.getClass().getSimpleName()))
			sanduiche = new Sanduiche(fabrica);
		else if(SanduichesIngredientFactoryJP.class.getSimpleName().equals(fabrica.getClass().getSimpleName()))
			sanduiche = new Sanduiche(fabrica);
		else if(SanduichesIngredientFactoryRT.class.getSimpleName().equals(fabrica.getClass().getSimpleName()))
			sanduiche = new Sanduiche(fabrica);
	}

}
