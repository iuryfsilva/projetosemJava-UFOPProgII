package exercicio6AbstractFactory;

public class SanduichesIngredientFactoryRT implements SanduichesIngredientFactory{

	@Override
	public PaoIF criarPao() {
		return new PaoBola();
	}

	
	@Override
	public QueijoIF criarQueijo() {
		return new QueijoCheddar();
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
