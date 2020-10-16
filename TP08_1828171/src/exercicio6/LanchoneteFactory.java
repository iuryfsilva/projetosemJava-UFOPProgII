package exercicio6;

import java.util.Scanner;

public class LanchoneteFactory implements SanduicheIngredientFactory{
	public static Scanner teclado = new Scanner(System.in);

	public static Sanduiche factorySanduiche() {

		System.out.println("Informe o tipo de sanduiche conforme a tabela do enunciado da questão: ");
		String escolha = teclado.next();

		if(escolha.equalsIgnoreCase("CG"))
			return new Sanduiche("Integral", "Prato", "De Peru", false);
		else if(escolha.equalsIgnoreCase("JP"))
			return new Sanduiche("Francês", "Mussarela", "De Frango", true);
		else 
			return new Sanduiche("Bola", "Cheddar", "De Peru", false);
	}
}
