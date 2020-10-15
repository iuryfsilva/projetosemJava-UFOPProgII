package com.ufop.prog2.factory;

public class PizzaMussarela extends Pizza{
	
	private String processoDeFabricacao;
	
	protected PizzaMussarela(String processoDeFabricacao) {
		super("Mussarela");
		this.processoDeFabricacao = processoDeFabricacao;
	}
	
	@Override
	public String toString() {
		return super.toString() + " - " + this.processoDeFabricacao;
	}

}
