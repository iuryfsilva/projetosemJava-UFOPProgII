package exercicio3;

public class Teste {

	public static void main(String[] args) {

		System.out.println("------------------------------------");
		FormaGeometrica forma = FormaGeometricaFactory.getForma();
		System.out.println("Forma criada: ");
		forma.desenhar();
		
		System.out.println("------------------------------------");
		FormaGeometrica forma1 = FormaGeometricaFactory.getForma();
		System.out.println("Forma criada: ");
		forma1.desenhar();
		
		System.out.println("------------------------------------");
		FormaGeometrica forma2 = FormaGeometricaFactory.getForma();
		System.out.println("Forma criada: ");
		forma2.desenhar();
		
	}

}
