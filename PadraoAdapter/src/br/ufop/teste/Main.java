package br.ufop.teste;

import java.util.ArrayList;

import br.ufop.tomada.AdaptadorDeTomadaDoisPinos;
import br.ufop.tomada.TomadaDeTresPinos;
import br.ufop.tomada.TomadaDoisPinos;

public class Main {

	public static void main(String[] args) {

		TomadaDoisPinos tomada2Pinos = new TomadaDoisPinos();
		
		tomada2Pinos.ligarNaTomadaDeDoisPinos();
		
		TomadaDeTresPinos tomad3Pinos = new TomadaDeTresPinos();
		
		tomad3Pinos.ligarNaTomadaDeTresPinos();
		
		ArrayList<TomadaDoisPinos> equipamentos = new ArrayList<>();
		
		AdaptadorDeTomadaDoisPinos adaptador = new AdaptadorDeTomadaDoisPinos(tomad3Pinos);
		
		equipamentos.add(tomada2Pinos);
		equipamentos.add(adaptador);
		
		for (TomadaDoisPinos tomadaDoisPinos : equipamentos) {
			tomadaDoisPinos.ligarNaTomadaDeDoisPinos();
		}
		
	}

}
