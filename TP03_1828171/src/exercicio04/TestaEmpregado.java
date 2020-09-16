package exercicio04;
import java.util.Scanner;
import exercicio01.Empregado;

public class TestaEmpregado {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Empregado empregado[] = new Empregado[4];
		
		String nomeEmpregado = "";
		float salario;
		for(int controle = 0; controle < empregado.length; controle++) {
			System.out.println("Informe o nome do empregado: ");
			nomeEmpregado = teclado.next();
			System.out.println("Informe o sal�rio: ");
			salario = teclado.nextFloat();
			empregado[controle] = new Empregado(nomeEmpregado, salario);
		}
		
		for(int controle = 0; controle < empregado.length; controle++) {
			empregado[controle].printInfo();
		}
		
		
		System.out.println("Empregados cadastrados: " + Empregado.getContadorEmpregados());

		
		teclado.close();		
	}

}
