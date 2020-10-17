package com.abstractfactory;

public class FabricaDeCarro {

	private static Carro montarCarro(String tipo) {
		CarroFactory carroFactory = null;
		
		if(tipo.equalsIgnoreCase("Luxo"))
			carroFactory = new CarroLuxoFactory();
		else if(tipo.equalsIgnoreCase("Popular"))
			carroFactory = new CarroPopularFactory();
		
		Carro carro = new Carro();
		carro.setRoda(carroFactory.MontarRoda());
		carro.setSom(carroFactory.MontarSom());
		
		return carro;
	}
	
	public static void main(String[] args) {
		Carro carro1 = montarCarro("LUXO");
		Carro carro2 = montarCarro("PoPular");
		
		System.out.println("END");
	}
	
}
