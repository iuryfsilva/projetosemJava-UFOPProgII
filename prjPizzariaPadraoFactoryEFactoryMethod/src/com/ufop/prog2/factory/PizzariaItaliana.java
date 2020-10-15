package com.ufop.prog2.factory;

public class PizzariaItaliana extends FabricaAbstrataDePizza{

	@Override
	public Pizza FactoryPizza(String sabor) {
		if(sabor.equals("PizzaPortuguesa"))
			return new PizzaPortuguesa();
		else if(sabor.equals("PizzaMussarela"))
			return new PizzaMussarela("Processo de Fabricacao de Pizza mussarela italiana ");
		else if(sabor.equals("PizzaQuatroQueijos"))
			return new PizzaQuatroQueijos();
		else
			return new Pizza(sabor);
	}

}
