package exercicio4FactoryMethod;

import java.util.Scanner;

public class TestaLanchonete {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o tipo de sanduiche conforme a tabela do enunciado da questão: ");
		String escolha = teclado.next();
		
		Lanchonete lanchonete = new Lanchonete();
		lanchonete.montarSanduiche(escolha);
		System.out.println(lanchonete.entrega());
	
		teclado.close();		
		
	}

}
