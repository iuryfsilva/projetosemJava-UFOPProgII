package com.ufop.prog2.factory;

public class Pizzaria {//fabrica uma pizza e envia pra quem esta chamando o metodo
	
	public static Pizza factoryPizza(String sabor) {
		if(sabor.equals("PizzaPortuguesa"))
			return new PizzaPortuguesa();
		else if(sabor.equals("PizzaMussarela"))
			return new PizzaMussarela("Tradicional");
		else if(sabor.equals("PizzaQuatroQueijos"))
			return new PizzaQuatroQueijos();
		else
			return new Pizza(sabor);
	}
	
	
}
