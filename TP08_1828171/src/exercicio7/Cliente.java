package exercicio7;

public class Cliente {

	private SomadorEsperado somador;
	public Cliente(SomadorEsperado somador) {//Foi necessaria uma correção no modificador de acesso desse construtor
		this.somador = somador;
	}
	
	public void execultar() {
		int[] vetor = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int soma = somador.somaVetor(vetor);
		System.out.println("resultado: " + soma);
	}
	
}
