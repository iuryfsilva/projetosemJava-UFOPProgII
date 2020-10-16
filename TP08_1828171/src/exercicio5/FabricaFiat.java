package exercicio5;

public class FabricaFiat extends FabricaDeCarro{

	@Override
	public CarroSedan criarCarroSedan() {
		return new Siena();
	}

	@Override
	public CarroPopular criarCarroPopular() {
		return new Palio();
	}


	
}
