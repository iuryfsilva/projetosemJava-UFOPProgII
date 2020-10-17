package exercicio6;

public class Sanduiche {

	private PaoIF pao;
	private QueijoIF queijo;
	private PresuntoIF presunto;
	private SaladaIF salada;
	
	protected Sanduiche(PaoIF pao, QueijoIF queijo, PresuntoIF presunto, SaladaIF salada) {
		this.setPao(pao);
		this.setQueijo(queijo);
		this.setPresunto(presunto);
		this.setSalada(salada);
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
		String string = "Sanduiche: \n Duas fatias de pão " + this.getPao();
		string +=  ", uma fatia de queijo " + this.getQueijo(); 
		string +=  ",\n uma fatia de presunto " + this.getPresunto();
		string +=  ".\n Tem Salada? " + this.getSalada();
		return  string;
	}


}
