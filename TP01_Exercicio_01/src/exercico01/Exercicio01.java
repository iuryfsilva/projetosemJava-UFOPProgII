package exercico01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		//float vetorTeste[] = {-15, -65, -12, -5, -3.45f};
		
		Scanner teclado = new Scanner(System.in);
		Metodos01 funcao = new Metodos01();
		
		System.out.println("Informe o tamanho do vetor: ");
		int tamanho = teclado.nextInt();
		
		float vetorTeste[] = new float[tamanho];	
		
		funcao.preencheVetor(vetorTeste);
		funcao.imprimeVetor(vetorTeste);
		System.out.printf("\nQuantidade de negativos: %d", funcao.negativos(vetorTeste));
		
		teclado.close();
	}
	
}
