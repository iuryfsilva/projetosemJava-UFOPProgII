package exercicio02;

import java.util.Scanner;

public class Metodos02 {

	public void preencheVetor(int vetor[]) {
		
		Scanner teclado = new Scanner(System.in);
		
		for(int controle = 0; controle < vetor.length; controle++) {
			System.out.println("Informe o um valor para" + " a posição [" + controle + "]: ");
			vetor[controle] = teclado.nextInt();
		}
		teclado.close();
		 
	}
	
	public void numerosPrimos(int vetor[]) {
		System.out.println("Valores primos no vetor: ");
		for(int controleX = 0; controleX < vetor.length; controleX++) {
			int numeroDivisores = 0;
			for(int controleY = 1; controleY <= vetor[controleX]; controleY++) {
				if((vetor[controleX] % controleY) == 0) {
					numeroDivisores++;
					//Linha teste divisores
					//System.out.println("Achei um divisor para: " + vetor[controleX] + " " + controleY);
				}
			}
			if(numeroDivisores == 2) System.out.printf("Posição %d, numero primo %d\n", controleX, vetor[controleX]);
		}
		System.out.println();
		
		System.out.println("Vetor informado: ");
		for(int controle = 0; controle < vetor.length; controle++) {
			System.out.print(vetor[controle] + " ");
		}
	}
	
	public void execultar() {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do vetor: ");
		int tamanho = teclado.nextInt();
		
		int vetorTeste[] = new int[tamanho];
		preencheVetor(vetorTeste);
		numerosPrimos(vetorTeste);
		
		teclado.close();
	}
}