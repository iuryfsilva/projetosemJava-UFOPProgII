package exercicio6AbstractFactory;

public class SanduichesIngredientFactoryJP implements SanduichesIngredientFactory{

	@Override
	public PaoIF criarPao() {
		return new PaoFrances();
	}

	@Override
	public QueijoIF criarQueijo() {
		return new QueijoMussarela();
	}

	@Override
	public PresuntoIF criarPresunto() {
		return new PresuntoDeFrango();
	}

	@Override
	public SaladaIF criarSalada() {
		return new ComVerdura();
	}

}
