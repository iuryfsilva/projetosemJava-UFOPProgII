package exercicio03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestaEmpregado {

	public static void main(String[] args) {

		List<Funcionario> listaEmpregados = new ArrayList<Funcionario>();
		Funcionario funcionario0 = new Funcionario("0000", "Iury Silva", "01012017");
		Funcionario funcionario1 = new Funcionario("0001", "Diego Sousa", 1, 3, 2018);
		Funcionario funcionario2 = new Funcionario("0002", "Ze Ricardo", 1, 2, 2019);

		listaEmpregados.add(funcionario0);
		listaEmpregados.add(funcionario1);
		listaEmpregados.add(funcionario2);

		System.out.println("------------------------------");

		for (int controle = 0; controle < listaEmpregados.size(); controle++) {
			System.out.println(listaEmpregados.get(controle).toString());
		}
		
		Collections.sort(listaEmpregados);
		System.out.println("-------Ordem Alfabetica--------");
		System.out.println("------------------------------");

		for (int controle = 0; controle < listaEmpregados.size(); controle++) {
			System.out.println(listaEmpregados.get(controle).toString());
		}
		
		System.out.println("------------------------------");
		System.out.println("-------Ordem Alfabetica--------");
		Collections.sort(listaEmpregados, Comparator<T>);
		
		System.out.println("-------------------------------");
		
		Funcionario maiorValor = Collections.max(listaEmpregados);
		System.out.println("Maior valor armazenado: " + maiorValor.toString());
		
		Funcionario menorValor = Collections.min(listaEmpregados);
		System.out.println("Menor valor armazenado: " + menorValor.toString());
		
	}

}
