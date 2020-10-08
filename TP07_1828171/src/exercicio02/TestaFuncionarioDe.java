package exercicio02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TestaFuncionarioDe {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		List<String> arrayChaves = new ArrayList<String>();
		arrayChaves.add("a1234");
		arrayChaves.add("a1235");
		arrayChaves.add("a1236");
		arrayChaves.add("a1237");
		arrayChaves.add("a1238");
		
		List<String> arrayNomes = new ArrayList<String>();
		arrayNomes.add("Steve Jobs");
		arrayNomes.add("Scott McNealy");
		arrayNomes.add("Jeff Bezos");
		arrayNomes.add("Larry Ellison");
		arrayNomes.add("Bill Gates");
		
		List<Funcionario> arrayFuncionarios = new ArrayList<Funcionario>();
		for (int controle = 0; controle < arrayNomes.size(); controle++) {
			arrayFuncionarios.add(new Funcionario(arrayChaves.get(controle), arrayNomes.get(controle)));
		}
		
		Map<String, Funcionario> mapaFuncionarios = new HashMap<String, Funcionario>();
		for(int controle = 0; controle < arrayFuncionarios.size(); controle++) {
			mapaFuncionarios.put(arrayFuncionarios.get(controle).getID(), arrayFuncionarios.get(controle));
		}
		
		System.out.println("Informe o ID do Funcionario: ");
		String idInformado = teclado.next();
		Funcionario retorno = buscaComQualquerCaso(mapaFuncionarios, idInformado);
		System.out.println("-----------------------------");
		System.out.println(retorno.toString());
				
		for(int controle = 0; controle < mapaFuncionarios.size(); controle++) {
			System.out.println("-----------------------------");
			Funcionario auxiliar = mapaFuncionarios.get(arrayChaves.get(controle));
			System.out.println("ID: " + auxiliar.getID() + " - Nome: " + auxiliar.getNome());
		}
		
		teclado.close();
	}

	static Funcionario buscaComQualquerCaso(Map<String, Funcionario> mapa, String chave) {
		String chaveAuxilar = chave.toLowerCase();		
		return mapa.get(chaveAuxilar);
	}
	

}
