package exercicio03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestaEmpregado {

	public static void main(String[] args) {

		List<Funcionario> listaEmpregados = new ArrayList<Funcionario>();
		Funcionario funcionario0 = new Funcionario("0000", "Aury Silva", "01/01/2017");
		funcionario0.setSalario(1400);
		Funcionario funcionario1 = new Funcionario("0001", "Biego Sousa", "01/02/2018");
		funcionario1.setSalario(1200);
		Funcionario funcionario2 = new Funcionario("0002", "Ze Ricardo", "01/03/2020");
		funcionario2.setSalario(1500);
		
		listaEmpregados.add(funcionario0);
		listaEmpregados.add(funcionario1);
		listaEmpregados.add(funcionario2);

		System.out.println("------------------------------");
		System.out.println("-----Empregados na lista------");

		imprimeDados(listaEmpregados);
	
		System.out.println("------------------------------");
		System.out.println("-------Ordem Alfabetica--------");
		
		Collections.sort(listaEmpregados, Comparator.comparing((Funcionario nome) -> nome.getNome()));

		imprimeDados(listaEmpregados);

		System.out.println("------------------------------");
		System.out.println("---Ordem Crescente salario----");

		Collections.sort(listaEmpregados, Comparator.comparing((Funcionario nome) -> nome.getSalario()));
		
		imprimeDados(listaEmpregados);
		
		
		System.out.println("-------------------------------");
		System.out.println("--------Maior Salario----------");
		
		Funcionario maiorValor = Collections.max(listaEmpregados);
		System.out.println("Maior valor armazenado: " + maiorValor.toString());

		System.out.println("-------------------------------");
		System.out.println("--------Menor Salario----------");

		Funcionario menorValor = Collections.min(listaEmpregados);
		System.out.println("Menor valor armazenado: " + menorValor.toString());

		System.out.println("-------------------------------");
		System.out.println("--------Mais Experiente--------");
		
		Funcionario maisExperiente = Collections.max(listaEmpregados, Comparator.comparing((Funcionario funcionario) -> funcionario.getDataContratacao()));
		System.out.println("Funcionario mais experiente: " + maisExperiente.toString());

		System.out.println("-------------------------------");
		System.out.println("--------Menos Experiente-------");

		Funcionario menosExperiente = Collections.min(listaEmpregados, Comparator.comparing((Funcionario funcionario) -> funcionario.getDataContratacao())); 
		System.out.println("Funcionario menos experiente: " + menosExperiente.toString());
		
	}
	
	public static void imprimeDados(List<Funcionario> lista) {
		for (int controle = 0; controle < lista.size(); controle++) {
			System.out.println(lista.get(controle).toString());
		}
	}

}
