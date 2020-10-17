package exercicio4;

import java.util.Scanner;

public class TestaSanduicheFactory {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o tipo de sanduiche conforme a tabela do enunciado da questão: ");
		String escolha = teclado.next();
		Sanduiche meuSanduiche = LanchoneteFactory.factorySanduiche(escolha);
		System.out.println(meuSanduiche);
		
		teclado.close();
	}

}
