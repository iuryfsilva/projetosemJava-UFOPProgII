package exercicio05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o tipo de ingresso: 1-Normal/ 2-VIP ");
		int resposta = teclado.nextInt();
		
		if(resposta == 1) {
			
			Normal ingresso = new Normal();
			System.out.println("Tipo ingresso: ");
			ingresso.imprimeIngressoNormal();
			System.out.println("Valor do ingresso: ");
			ingresso.imprimeValor();
			
		}else if(resposta ==2) {
			
			System.out.println("Informe o tipo de ingresso: 1-Camarote Superior/ 2-Camarote Inferior ");
			resposta = teclado.nextInt();
			
			if(resposta == 1) {
				
				CamaroteSuperior ingresso = new CamaroteSuperior();
				System.out.println("Tipo ingresso: Camarote VIP Superior");
				System.out.println("Valor do ingresso: ");
				System.out.println(ingresso.valorIngressoComAdicionalCamaroteSuperior());
				
			}else if(resposta ==2) {
				
				CamaroteInferior ingresso = new CamaroteInferior();
				System.out.println("Tipo ingresso: Camarote VIP Inferior");
				System.out.println("Valor do ingresso: ");
				System.out.println(ingresso.valorIngressoComAdicional());
				ingresso.printLocalizacaoIngresso();
				
			}
			
		}
		
		teclado.close();
		
	}

}
