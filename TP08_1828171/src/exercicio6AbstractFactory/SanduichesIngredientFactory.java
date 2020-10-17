package exercicio6AbstractFactory;

public interface SanduichesIngredientFactory {

	//public Sanduiche factorySanduiche();
	public PaoIF criarPao();
	public QueijoIF criarQueijo();
	public PresuntoIF criarPresunto();
	public SaladaIF criarSalada();

}
