package exercicio05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questão2 {

	public static void main(String[] args) {
		
		boolean controle = false;
		double r = 0;
		int x = 0;
		int y = 0;
		System.out.println("Eu sei dividir! "); 
		while(controle == false){
			try {
				Scanner teclado = new Scanner(System.in);

				System.out.println("Informe o primeiro valor: ");
				x = teclado.nextInt();
				
				System.out.println("Informe o segundo valor: ");
				y = teclado.nextInt();
				
				r = ((float)x / (float)y); 
				System.out.println("O resultado da Divisao é: " + r);
				controle = true;
				
				teclado.close();

			} catch (InputMismatchException excecao) {//receber valores de tipos diferentes de int
				System.out.println("ERRO: O tipo do valor Deve ser INTEIRO!");
				x = 0;
				y = 0;
				controle = false;
				continue;
			} catch (ArithmeticException excecao) {// problema da divisão por 0
				System.out.println("ERRO: O valor de y não pode ser 0!");
				x = 0;
				y = 0;
				controle = false;
				continue;
			} catch (Exception excecao) {//Outros tipos de erros
				System.out.println("ERRO: Erro inesperado!");
				x = 0;
				y = 0;
				controle = false;
				continue;
			}
			
		}
		
	}

	
}
