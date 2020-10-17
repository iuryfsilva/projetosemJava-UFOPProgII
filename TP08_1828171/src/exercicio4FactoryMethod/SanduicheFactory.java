package exercicio4FactoryMethod;

public abstract class SanduicheFactory {

	protected Sanduiche sanduiche;
	
	public abstract void montarSanduiche(String tipo);
	
	public Sanduiche entrega() {
		return sanduiche;
	}
	
}
