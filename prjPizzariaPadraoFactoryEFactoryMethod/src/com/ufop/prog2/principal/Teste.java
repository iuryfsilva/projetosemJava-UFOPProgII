package com.ufop.prog2.principal;

import com.ufop.prog2.factory.FabricaAbstrataDePizza;
import com.ufop.prog2.factory.Pizza;
//import com.ufop.prog2.factory.PizzaPortuguesa;
import com.ufop.prog2.factory.Pizzaria;
import com.ufop.prog2.factory.PizzariaItaliana;
import com.ufop.prog2.factory.PizzariaMinas;

public class Teste {

	public static void main(String[] args) {

		Pizza minhaPizza = Pizzaria.factoryPizza("PizzaMussarela");	
		System.out.println(minhaPizza);
		
		FabricaAbstrataDePizza pizzaria = new PizzariaItaliana();
		Pizza minhaPizza2 = pizzaria.FactoryPizza("PizzaMussarela");
		System.out.println(minhaPizza2.toString());
		
		FabricaAbstrataDePizza pizzariaM = new PizzariaMinas();
		Pizza minhaPizza3 = pizzariaM.FactoryPizza("PizzaMussarela");
		System.out.println(minhaPizza3.toString());
		
	}

}
