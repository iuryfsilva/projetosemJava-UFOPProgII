package exercicio6;

public class SanduichesIngredientFactoryCG implements SanduichesIngredientFactory{

	@Override
	public Sanduiche factorySanduiche(PaoIF pao, QueijoIF queijo, PresuntoIF presunto, SaladaIF salada) {
		return new Sanduiche(pao, queijo, presunto, );
	}
	
	@Override
	public String toString() {
		return SanduichesIngredientFactoryCG.class.getSimpleName();
	}

}
