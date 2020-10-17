package exercicio4FactoryMethod;

public class Sanduiche {

	private String pao, queijo, presunto, salada; 
	
	protected Sanduiche(String pao, String queijo, String presunto, String salada) {
		this.setPao(pao);
		this.setQueijo(queijo);
		this.setPresunto(presunto);
		this.setSalada(salada);
	}

	public String getPao() {
		return this.pao;
	}
	public void setPao(String pao) {
		this.pao = pao;
	}
	
	public String getQueijo() {
		return this.queijo;
	}
	public void setQueijo(String queijo) {
		this.queijo = queijo;
	}

	public String getPresunto() {
		return this.presunto;
	}
	public void setPresunto(String presunto) {
		this.presunto = presunto;
	}
	
	public String getSalada() {
		return this.salada;
	}
	public void setSalada(String salada) {
		this.salada = salada;
	}
	
	@Override
	public String toString() {
		String string = "Sanduiche: \nDuas fatias de pão " + this.getPao();
		string +=  ", uma fatia de queijo " + this.getQueijo(); 
		string +=  ",\numa fatia de presunto " + this.getPresunto();
		string +=  ", salada - " + this.getSalada();
		return  string;
	}


}
