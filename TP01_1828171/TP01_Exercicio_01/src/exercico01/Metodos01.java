package exercico01;

import java.util.Scanner;

public class Metodos01 {
	
	public void preencheVetor(float vet[]) {
		
		Scanner teclado = new Scanner(System.in);
		
		for(int controle = 0; controle < vet.length; controle++) {
			System.out.println("Informe o um valor para a posição [" + controle + "]: ");
			vet[controle] = teclado.nextFloat();
		}
		teclado.close();
	}

	public void imprimeVetor(float vet[]) {
		System.out.print("[ ");
		for(int controle = 0; controle < vet.length; controle++) {
			System.out.print(vet[controle] + "   ");
		}
		System.out.print("]\n");
	}
	
	public void execultar() {
		//float vetorTeste[] = {-15, -65, -12, -5, -3.45f};
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o tamanho do vetor: ");
		int tamanho = teclado.nextInt();
		
		float vetorTeste[] = new float[tamanho];	
		
		preencheVetor(vetorTeste);
		imprimeVetor(vetorTeste);
		System.out.printf("\nQuantidade de negativos: %d", negativos(vetorTeste));
		teclado.close();
	}
	
 	public int negativos(float vet[]) {
		int quantidadeNegativos = 0;
		for(int controle = 0; controle < vet.length; controle++) {
			if(vet[controle] < 0) quantidadeNegativos++;
		}
		return quantidadeNegativos;
	}
}
