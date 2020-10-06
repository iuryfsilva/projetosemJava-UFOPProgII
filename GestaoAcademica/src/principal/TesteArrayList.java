package principal;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TesteArrayList {

	public static void main(String[] args) {
		List<String> listaDeNomes = new LinkedList<String>();
		listaDeNomes.add("Iury");
		listaDeNomes.add("Jao");
		listaDeNomes.add("Ze");
		
		System.out.println(listaDeNomes.get(2));
		System.out.println(listaDeNomes.size());
		
		imprimeLista(listaDeNomes);
		
		String nomeRetornado = listaDeNomes.remove(2);
		System.out.println("nomeRetornado: " + nomeRetornado);
		
		imprimeLista(listaDeNomes);
		
		listaDeNomes.remove(0);
		
		listaDeNomes.add("Paulo");
		listaDeNomes.add(0,"Antonio");
		
		imprimeLista(listaDeNomes);
		
		Collections.shuffle(listaDeNomes);
		
		imprimeLista(listaDeNomes);
		
	}
	
	public static void imprimeLista(List<String> lista) {
		System.out.println("-----------------------------");
		for(int controle = 0; controle < lista.size(); controle++) {
			System.out.println(lista.get(controle));
		}
	}

}
