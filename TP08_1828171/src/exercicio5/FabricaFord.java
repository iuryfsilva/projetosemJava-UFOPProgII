package exercicio5;

public class FabricaFord extends FabricaDeCarro{

	@Override
	public CarroSedan criarCarroSedan() {
		return new FiestaSedan();
	}

	@Override
	public CarroPopular criarCarroPopular() {
		return new Fiesta();
	}

}
