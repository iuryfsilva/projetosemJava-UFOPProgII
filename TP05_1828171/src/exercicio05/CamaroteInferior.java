package exercicio05;

public class CamaroteInferior extends VIP{

	private String localizacaoIngresso;

	public String getLocalizacaoIngresso() {
		return this.localizacaoIngresso;
	}
	public void setLocalizacaoIngresso(String localizacaoIngresso) {
		this.localizacaoIngresso = localizacaoIngresso;
	}	
	public void printLocalizacaoIngresso() {
		System.out.println("Localização do ingresso: " + this.getLocalizacaoIngresso());
	}

}
