package exercicio4FactoryMethod;

public class Lanchonete extends SanduicheFactory{

	@Override
	public void montarSanduiche(String tipo){
		if(tipo.equalsIgnoreCase("CG"))
			sanduiche = new SanduicheCG();
		else if(tipo.equalsIgnoreCase("JP"))
			sanduiche = new SanduicheJP();
		else if(tipo.equalsIgnoreCase("RT"))
			sanduiche = new SanduicheRT();
	}

}
