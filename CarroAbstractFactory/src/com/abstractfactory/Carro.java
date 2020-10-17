package com.abstractfactory;

public class Carro {
	private Roda roda;
	private Som som;
	
	public Roda getRoda() {
		return this.roda;
	}
	public void setRoda(Roda roda) {
		this.roda = roda;
	}
	
	public Som getSom() {
		return this.som;
	}
	public void setSom(Som som) {
		this.som = som;
	}
	
	
}
