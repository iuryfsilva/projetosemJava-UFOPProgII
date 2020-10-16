package exercicio3;

import java.util.Scanner;

public abstract class FormaGeometricaFactory {
	public static Scanner teclado = new Scanner(System.in);

	public static FormaGeometrica getForma(){
		
		System.out.println("Informe a forma que deseja desenhar: ");
		String escolha = teclado.next();
				
		if(escolha.equalsIgnoreCase("Circulo"))
			return new Circulo();
		else if(escolha.equalsIgnoreCase("Quadrado"))
			return new Quadrado();
		else 
			return new Triangulo();
	}

}
