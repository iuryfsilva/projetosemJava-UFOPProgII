package exercicio02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestaFuncionarioAbC {

	public static void main(String[] args) {
		
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
		
		Map<String, String> mapaEmpregado = new HashMap<String, String>();
		for(int controle = 0; controle < arrayNomes.size(); controle++) {
			mapaEmpregado.put(arrayChaves.get(controle), arrayNomes.get(controle));
			System.out.print(arrayChaves.get(controle) + " ");
			System.out.println(arrayNomes.get(controle));
		}
		mapaEmpregado.put("a9999", "Iury Silva");

		System.out.println("--------------------------------");
		
		System.out.println("Id: a1234 - Nome: " + mapaEmpregado.get("a1234"));
		System.out.println("Id: a1235 - Nome: " + mapaEmpregado.get("a1235"));
		System.out.println("Id: a1236 - Nome: " + mapaEmpregado.get("a1236"));
		System.out.println("Id: a1237 - Nome: " + mapaEmpregado.get("a1237"));
		System.out.println("Id: a1238 - Nome: " + mapaEmpregado.get("a1238"));
		System.out.println("Id: a9999 - Nome: " + mapaEmpregado.get("a9999"));
		
		System.out.println("--------------------------------");
		
		// O get usa um operador ternário para saber se a chave == null se for retorna null
		// senão retorna o valor correspondente
		if(mapaEmpregado.get("a9510") == null) {
			System.out.println("Id: a9510 - Nome: " + mapaEmpregado.get("a9510"));
			System.out.println("Funcionario não cadastrado");
		}
		
		System.out.println("--------------------------------");
		
		System.out.println("Retorno metodo busca: Chave a1234 - " + buscaComQualquerCaso(mapaEmpregado, "a1234"));
		System.out.println("Retorno metodo busca: Chave A1234 - " + buscaComQualquerCaso(mapaEmpregado, "A1234"));
		
		
	}
	
	static String buscaComQualquerCaso(Map<String, String> mapa, String chave) {
		String chaveAuxilar = chave.toLowerCase();		
		return mapa.get(chaveAuxilar);
	}
	

}
