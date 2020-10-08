package exercicio03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDeInteiros {

	public static void main(String[] args) {

		List<Integer> listaDeInteiros = new ArrayList<Integer>();
		for (int controle = 0; controle < 50; controle++) {
			int valorAleatorioDe0a99 = (int)(0 + Math.random() * (99 - 0));
			listaDeInteiros.add(valorAleatorioDe0a99);
			System.out.println("Valor gerado: " + valorAleatorioDe0a99 + " - Controle: " + controle);
		}
		
		System.out.println("------------------------------");
		int maiorValor = Collections.max(listaDeInteiros);
		System.out.println("Maior valor armazenado: " + maiorValor);
		
		int menorValor = Collections.min(listaDeInteiros);
		System.out.println("Menor valor armazenado: " + menorValor);
		
		System.out.println("------------------------------");
		
		int contadorMaior = 0;
		for (Integer valor : listaDeInteiros) {
			if(valor.equals(maiorValor))
				contadorMaior++;
		}
		
		System.out.println("Quantidade de vezes que o maior apareceu: " + contadorMaior);

		int contadorMenor = 0;
		for (Integer valor : listaDeInteiros) {
			if(valor.equals(menorValor))
				contadorMenor++;
		}
		
		System.out.println("Quantidade de vezes que o menor apareceu: " + contadorMenor);

		System.out.println("------------------------------");
		System.out.println("-------Ordem crescente--------");
		
		Collections.sort(listaDeInteiros);
		
		for (int controle = 0; controle < 50; controle++) {
			System.out.println("Valor gerado: " + listaDeInteiros.get(controle) + " - Controle: " + controle);
		}
		
	}

}
