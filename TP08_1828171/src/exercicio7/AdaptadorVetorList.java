package exercicio7;

public class AdaptadorVetorList implements SomadorEsperado{

	private SomadorExistente somadorExistente;
	
	public AdaptadorVetorList(SomadorExistente somadorExistente) {
		this.somadorExistente = somadorExistente;
	}
	
	@Override
	public int somaVetor(int[] vetor) {
		int soma = 0;
		for (int index = 0; index < vetor.length; index++) {
			
		}
		return 0;
	}

}
