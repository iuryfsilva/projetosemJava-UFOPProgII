package exercicio6AbstractFactory;

public class SanduichesIngredientFactoryCG implements SanduichesIngredientFactory{

	@Override
	public PaoIF criarPao() {
		return new PaoIntegral();
	}

	@Override
	public QueijoIF criarQueijo() {
		return new QueijoPrato();
	}

	@Override
	public PresuntoIF criarPresunto() {
		return new PresuntoDePeru();
	}

	@Override
	public SaladaIF criarSalada() {
		return new SemVerdura();
	}

}
