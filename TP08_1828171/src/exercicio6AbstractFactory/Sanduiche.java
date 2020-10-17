package exercicio6AbstractFactory;

public class Sanduiche {

	//private SanduichesIngredientFactory igredientes;
	private PaoIF pao;
	private QueijoIF queijo;
	private PresuntoIF presunto;
	private SaladaIF salada;
	
	protected Sanduiche(SanduichesIngredientFactory ingredientes) {
		this.setPao(ingredientes.criarPao());
		this.setQueijo(ingredientes.criarQueijo());
		this.setPresunto(ingredientes.criarPresunto());
		this.setSalada(ingredientes.criarSalada());
	}

	protected PaoIF getPao() {
		return this.pao;
	}
	protected void setPao(PaoIF pao) {
		this.pao = pao;
	}

	protected QueijoIF getQueijo() {
		return this.queijo;
	}
	protected void setQueijo(QueijoIF queijo) {
		this.queijo = queijo;
	}

	protected PresuntoIF getPresunto() {
		return this.presunto;
	}
	protected void setPresunto(PresuntoIF presunto) {
		this.presunto = presunto;
	}

	protected SaladaIF getSalada() {
		return this.salada;
	}
	protected void setSalada(SaladaIF salada) {
		this.salada = salada;
	}


	@Override
	public String toString() {
		String string = "Sanduiche: Duas fatias de pão " + this.getPao();
		string += ", uma fatia de queijo " + this.getQueijo(); 
		string += ",\n	   uma fatia de presunto " + this.getPresunto();
		string += ", salada - " + this.getSalada();
		return  string;
	}
	
	
}
