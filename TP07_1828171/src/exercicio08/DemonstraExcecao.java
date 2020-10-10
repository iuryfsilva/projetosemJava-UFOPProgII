package exercicio08;

public class DemonstraExcecao {

	public static void main(String[] args) {

		System.out.println("Inicio do main");
		try {
			someMethod1();
		}catch ( ExcecaoDoUsuario excecao ){
			System.err.println("A StackTrace é:\n" + excecao.getMessage());
			excecao.printStackTrace();
		}
		System.out.println("Fim do main");

	}
	
	static void someMethod1() throws ExcecaoDoUsuario {
		System.out.println("Inicio do someMethod1");
		someMethod2();
		System.out.println("Fim do someMethod1");
	}

	static void someMethod2() throws ExcecaoDoUsuario {
		System.out.println("Inicio do someMethod2");
		someMethod3();
		System.out.println("Fim do someMethod2");
	}

	static void someMethod3() throws ExcecaoDoUsuario {
		System.out.println("Inicio do someMethod3");
		try {
			throw new ExcecaoDoUsuario("Esse é um erro definido pelo Programador. ");
		} catch (RuntimeException excecao) {
			System.err.println("A StackTrace é:\n" + excecao.getMessage());
			excecao.printStackTrace();
		}
		//System.out.println("Fim do someMethod3");

	}
	

}
