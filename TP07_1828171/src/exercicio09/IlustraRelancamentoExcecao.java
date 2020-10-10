package exercicio09;

import exercicio08.ExcecaoDoUsuario;

public class IlustraRelancamentoExcecao {

	public static void main(String[] args) {

		System.out.println("Inicio do main");
		try {
			someMethod();
		} catch (ExcecaoDoUsuario excecao) {
			System.err.println("A StackTrace é:\n" + excecao.getMessage());
			excecao.printStackTrace();
		}
		System.out.println("Fim do main");
		
	}
	
	static void someMethod() throws ExcecaoDoUsuario{
		System.out.println("Inicio do someMethod");
		try {
			someMethod2();
		} catch (ExcecaoDoUsuario excecao) {
			System.err.println("A StackTrace é:\n" + excecao.getMessage());
			excecao.printStackTrace();
		}
		System.out.println("Fim do someMethod");
	}
	
	static float someMethod2() throws ExcecaoDoUsuario{
		System.out.println("Inicio do someMethod2");
		throw new ExcecaoDoUsuario("Esse é um erro definido pelo Programador. ");
		//System.out.println("Fim do someMethod2");
	}
}
