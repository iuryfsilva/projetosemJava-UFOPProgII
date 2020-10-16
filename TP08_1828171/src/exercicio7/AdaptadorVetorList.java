package exercicio7;

import java.util.ArrayList;
import java.util.List;

public class AdaptadorVetorList implements SomadorEsperado{

	private SomadorExistente somadorExistente;
	
	public AdaptadorVetorList(SomadorExistente somadorExistente) {
		this.somadorExistente = somadorExistente;
	}
	
	@Override
	public int somaVetor(int[] vetor) {
		int soma = 0;
		List<Integer> listaAuxiliar = new ArrayList<Integer>();  
		for (int index = 0; index < vetor.length; index++) {
			listaAuxiliar.add(vetor[index]);
		}
		soma = this.somadorExistente.somaLista(listaAuxiliar);
		return soma;
	}

}
