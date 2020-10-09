package principal;

import java.io.FileInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import pessoas.Monitor;

public class TesteTratamentoDeExcecoes {

	public static void main(String[] args) {

		String palavras[] = new String[10];
		try {	
			palavras[0] = "Iury";
			palavras[1] = "Silva";
			palavras[2] = "Jao";
			
			System.out.println(palavras[0].length());
			
			System.out.println(palavras[7].length());
		}catch (Exception e) {
			System.out.println("Ocorreu um erro inesperado!");
		}
		
		System.out.println("Continuando.......");

		Scanner teclado = new Scanner(System.in);
		int a = 0, b = 0;
		double resultado = 0;
		
		try {
			System.out.println("Digite o valor inteiro para a: ");
			a = teclado.nextInt();
			System.out.println("Digite o valor inteiro para b: ");
			b = teclado.nextInt();	
			resultado = divisao(a, b);
			
		} catch (InputMismatchException e) {
			System.out.println("ERRO: Entrada inválida!");
		} catch (ArithmeticException e) {
			System.out.println("ERRO: O valor do denominador é igual a 0! ");
		} catch (Exception e) {
			System.out.println("ERRO: inesperado! ");
		}
		
		System.out.println("O resultado da divisao: " + resultado);

		System.out.println("Continuando.......");

		try {
			System.out.println("Chamando teste() ");
			teste();	
		} catch (Exception e) {
			System.out.println("Bugou");
		}finally {
			System.out.println("Sempre Entra AQUI");
		}
		
		
		System.out.println("Continuando.......");

		Monitor monitor = new Monitor("1828171", "Teste", "123", "12325");
		
		monitor.getDisciplinaMonitorada();
		
		teclado.close();
		
	}
	
	public static double divisao(int a, int b) {
			return a/b;
	}

	public static void teste() throws Exception{
			FileInputStream file = new FileInputStream("sdasdas");
			file.close();
	}
	
}
