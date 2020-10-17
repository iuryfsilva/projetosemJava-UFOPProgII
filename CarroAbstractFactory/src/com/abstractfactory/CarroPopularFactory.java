package com.abstractfactory;

public class CarroPopularFactory implements CarroFactory {

	@Override
	public Roda MontarRoda() {
		return new RodaSimples();
	}

	@Override
	public Som MontarSom() {
		return new TocaFitas();
	}

}
