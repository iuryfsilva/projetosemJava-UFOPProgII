package com.abstractfactory;

public class CarroLuxoFactory implements CarroFactory {

	@Override
	public Roda MontarRoda() {
		return new RodaLigaLeve();
	}

	@Override
	public Som MontarSom() {
		return new TocaCD();
	}

}
