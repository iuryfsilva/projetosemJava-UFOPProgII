package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import componentesCurriculares.Curso;
import componentesCurriculares.EngenhariaDaComputacao;

public class TestaOrdenacao {

	public static void main(String[] args) {

		List<Curso> listaDeCurso = new ArrayList<Curso>();
		
		for(int controle = 0; controle < 10; controle++) {
			Curso curso1 = new EngenhariaDaComputacao();
			curso1.setDuracao(controle + 10);
			listaDeCurso.add(curso1);
		}
		
		Collections.shuffle(listaDeCurso);
		
		for(int controle = 0; controle < 10; controle++) {
			listaDeCurso.get(controle).escreveNaTela();
		}
		
		Collections.sort(listaDeCurso);
		
		System.out.println("---------------------------------------------");
		for(int controle = 0; controle < 10; controle++) {
			listaDeCurso.get(controle).escreveNaTela();
		}
		
	}

}
