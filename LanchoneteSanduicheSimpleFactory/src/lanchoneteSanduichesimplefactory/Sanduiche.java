package lanchoneteSanduichesimplefactory;

public class Sanduiche {

	private String pao, queijo, presunto;
	private boolean salada; 
	
	protected Sanduiche(String pao, String queijo, String presunto, boolean salada) {
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
	
	public boolean getSalada() {
		return this.salada;
	}
	public void setSalada(boolean salada) {
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
