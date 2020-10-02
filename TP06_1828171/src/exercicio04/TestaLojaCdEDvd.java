package exercicio04;

import java.util.Scanner;

public class TestaLojaCdEDvd {

	public static void main(String[] args) {
		Midia midia[] = new Midia[100];
	 	Scanner teclado = new Scanner(System.in);

	 	int escolha = 0;
	 	int contador = 0;
	 	while(escolha != 4) {
	 		System.out.println("---------------------------");
	 		System.out.println("Digite:  1 - para cadastrar um CD / 2 - para cadastrar DVD ");
		 	System.out.println("Digite:  3 - para cadastrar uma MIDIA / 4 - para SAIR ");
	 		escolha = teclado.nextInt();
	 		switch(escolha) {
	 			case 1:
	 				midia[contador] = new CD();
	 				System.out.println("------Cadastro de CD-------");
	 				midia[contador].inserirDados();
	 				midia[contador].printDados();
	 				continue;
	 			case 2:
	 				midia[contador] = new DVD();
	 				System.out.println("------Cadastro de DVD------");
	 				midia[contador].inserirDados();
	 				midia[contador].printDados();
	 				continue;
	 			case 3:
	 				System.out.println("------Cadastro de Uma Midia-------");
	 				midia[contador] = new Midia(0000, 500.00, "The game of LIFE");
	 				midia[contador].printDados();
	 				continue;
	 			case 4:
	 				System.out.println("------------Encerrando------------");
	 				break;
	 		}
	 		contador++;
	 	}
		teclado.close();
	}

}
