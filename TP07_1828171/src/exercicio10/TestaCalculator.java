package exercicio10;

import java.util.InputMismatchException;

import ExcecoesTP07.InvalidOperationException;

public class TestaCalculator {

	public static void main(String[] args) {

		//try {
			
			Calculator calculadora = new Calculator();
			calculadora.execultaCalculadora();
		
		/*} catch (InvalidOperationException excecao) {
			System.err.println("Exce��o: " + excecao.getMessage() + "\nA StackTrace �:\n");
			excecao.printStackTrace();
		} catch (InputMismatchException excecao) {//receber valores de tipos diferentes de int
			System.err.println("ERRO: O tipo do valor Deve ser INTEIRO!");
			excecao.printStackTrace();
		} catch (ArithmeticException excecao) {// problema da divis�o por 0
			System.err.println("ERRO: O valor de y n�o pode ser 0!");
			excecao.printStackTrace();
		} catch (Exception excecao) {//Outros tipos de erros
			System.err.println("ERRO: Erro inesperado!");
			excecao.printStackTrace();
		}*/
	}

}
