package exercicio05;

public class ClasseContabilizar {
	
	public Resultado[] recebeParametros(Animal[] vetorA, Ferramentas ferramenta) {
		
		Resultado vetorResultado[] = new Resultado[vetorA.length];
		String vetorEspecies[] = ferramenta.classificaEspecies(vetorA);
		int quantidadeAnimais[] = new int[vetorEspecies.length];
		
		// Percorre o vetorA filtrando a quantidade de animais pela especie e coleta a contidade de animais de especicie a cada iteração
		for(int controle = 0; controle < vetorA.length; controle++) {
			for(int controleQuantidadeAnimais = 0; 
					controleQuantidadeAnimais < ferramenta.filtraEspecie(vetorA, vetorEspecies[controle]).length; 
					controleQuantidadeAnimais++) {
				quantidadeAnimais[controle]++;
			}
		}
		
		// Cria as instancias da classe Resultado no vetorResultado
		for(int controle = 0; controle < vetorEspecies.length; controle++) {
			vetorResultado[controle] = new Resultado(vetorEspecies[controle], quantidadeAnimais[controle]);
		}
		
		return vetorResultado;
	}
	
}
