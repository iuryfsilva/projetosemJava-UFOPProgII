package exercicio6AbstractFactory;

import java.util.Scanner;

public class TestaSanduicheFactory {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Lanchonete com AbstractMethod");
		System.out.println("Informe o tipo de sanduiche conforme a tabela do enunciado da questão: ");
		String escolha = teclado.next();
		
		SanduichesIngredientFactory fabrica = null;
		
		
		try {
			
			if(escolha.equalsIgnoreCase("CG"))
				fabrica = new SanduichesIngredientFactoryCG();
			else if(escolha.equalsIgnoreCase("JP"))
				fabrica = new SanduichesIngredientFactoryJP();
			else if(escolha.equalsIgnoreCase("RT"))
				fabrica = new SanduichesIngredientFactoryRT();
			else
				throw new Exception("Fabrica Invalida");

		}catch(Exception fabricaInvalida){
			System.err.println(fabricaInvalida.getMessage());
		}finally {
			teclado.close();
		}
		
		SanduicheFactory lanchonete = new Lanchonete();
		lanchonete.montarSanduiche(fabrica);
		System.out.println("Escolha: " + escolha + "\n" + lanchonete.entrega());
		
	}

}
