package exercicio6AbstractFactory;

public abstract class SanduicheFactory {

	protected Sanduiche sanduiche;
	
	public abstract void montarSanduiche(SanduichesIngredientFactory fabrica);
	
	public Sanduiche entrega() {
		return sanduiche;
	}
	
}
