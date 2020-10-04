package exercicio05;

public class TestaResultado {
	
	public static void main(String[] args) {

		Animal vetorAnimais[] = new Animal[5];
		
		vetorAnimais[0] = new ClasseAnimal("Felino", "Gato");
		vetorAnimais[1] = new ClasseAnimal("Canino", "Ruski");
		vetorAnimais[2] = new ClasseAnimal("Felino", "Jaguatirica");
		vetorAnimais[3] = new ClasseAnimal("Pato", "Selvagem");
		vetorAnimais[4] = new ClasseAnimal("Tubarão", "Branco");
		
		Ferramentas objFerramenta = new ClasseFerramentas();
				
		ClasseContabilizar contabilizar = new ClasseContabilizar();
		Resultado[] vetorResultado = contabilizar.recebeParametros(vetorAnimais, objFerramenta);
		
		System.out.println("Imprime o vetorResultado: ");
		for(int controle = 0; controle < vetorResultado.length; controle++) {
			System.out.println("Nome da Especie: " + vetorResultado[controle].getNomeEspecie());
			System.out.println("Quantidade de animais da especie: " + vetorResultado[controle].getQuantidade());
		}
		
		
		  
		
		
		
	}

	
}
