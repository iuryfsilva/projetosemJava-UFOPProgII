package exercicio05;

import java.util.Scanner;

public class Quest�o2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Eu sei dividir! ");
		System.out.println("Informe o primeiro valor: ");
		int x = teclado.nextInt();
		System.out.println("Informe o segundo valor: ");
		int y = teclado.nextInt();
		double r = (x / y); // problema da divis�o por 0
		System.out.println("O resultado da soma �: " + r);
		
		teclado.close();
	}

}
