package exercicio05;

import java.util.ArrayList;

public class ClasseFerramentas implements Ferramentas{

	// Devolve somente os animais da especie informada
	@Override
	public Animal[] filtraEspecie(Animal[] completo, String especieFiltrar) {
		
		ArrayList<Animal> especieAuxiliar = new ArrayList<>();
		
		for(Animal controle: completo) {
			if(controle.getNomeEspecie().equals(especieFiltrar)) {
				especieAuxiliar.add(controle);
			}
		}
		
		int tamanho = especieAuxiliar.size();
		Animal especie[] = new Animal[tamanho];
		
		for(int controle = 0; controle < especie.length; controle++) {
			especie[controle] = especieAuxiliar.get(controle);
		}
		
		return especie;
	}

	// Devolve um vetor de com as especies sem repetição
	@Override
	public String[] classificaEspecies(Animal[] completo) {
		
		String especie[] = new String[completo.length];
		for(int controle = 0; controle < completo.length; controle++) {
			if(controle == 0) {
				especie[controle] = completo[controle].getNomeEspecie();
			}
			for(int controleRepeticao = 0; controleRepeticao < completo.length; controleRepeticao++) {
				if(especie[controle] == completo[controleRepeticao].getNomeEspecie()) { 
					continue;
				}	
			}	
			especie[controle] = completo[controle].getNomeEspecie();
		}
		return especie;
	}

}
