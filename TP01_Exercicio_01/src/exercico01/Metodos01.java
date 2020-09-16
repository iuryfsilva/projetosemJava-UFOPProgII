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
	

	public int negativos(float vet[]) {
		int quantidadeNegativos = 0;
		for(int controle = 0; controle < vet.length; controle++) {
			if(vet[controle] < 0) quantidadeNegativos++;
		}
		return quantidadeNegativos;
	}
}
