package exercicio03;
import java.util.Scanner;

public class TestaElevador {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Elevador elevadorSocial1 = new Elevador();
		
		System.out.println("Informe a capacidade do Elevador: ");
		int capacidadeElevador = teclado.nextInt();
		System.out.println("Informe o total de andares do predio: ");
		int totalDeAndaresDoPredio = teclado.nextInt();
		elevadorSocial1.inicializa(capacidadeElevador, totalDeAndaresDoPredio);
		
		elevadorSocial1.entra();
		System.out.println("Entrou uma Pessoa");
		
		System.out.println("Subir ate o andar: ");
		int andarInformado = teclado.nextInt();
		for(int controle = elevadorSocial1.getAndarAtual(); controle <= andarInformado; controle++){
			elevadorSocial1.sobe();
			
			if(controle == 0)	
				System.out.println("   T�rreo");
			else
				System.out.printf("^ %d� Andar ^\n", controle);
			
			elevadorSocial1.setAndarAtual(controle);
		}
		
		elevadorSocial1.sai();
		System.out.println("Saiu uma Pessoa");
		
		elevadorSocial1.entra();
		System.out.println("Entrou uma Pessoa");
		
		System.out.println("Descer ate o andar: ");
		andarInformado = teclado.nextInt();
		elevadorSocial1.desce();
		for(int controle = elevadorSocial1.getAndarAtual(); controle >= andarInformado; controle--){
			elevadorSocial1.sobe();
			
			if(controle == 0)	
				System.out.println("    T�rreo");
			else
				System.out.printf("v %d� Andar v\n", controle);	
			
			elevadorSocial1.setAndarAtual(controle);
		}
		
		teclado.close();
	}

}
