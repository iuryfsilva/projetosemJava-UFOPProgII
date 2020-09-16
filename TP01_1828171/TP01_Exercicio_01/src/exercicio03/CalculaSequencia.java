package exercicio03;

public class CalculaSequencia {
	public long sequencia(long numero) {
		if((numero == 1) || (numero == 2)) {//testa casos basicos sequencia(1) = 1 
			return numero;				  //e sequencia(2) = 2
		}else {
			return (2 * sequencia(numero - 1)) + (3 * sequencia(numero - 2));
		}
	}
	
	public void imprimeSequencia(){
		for(int controle = 1; controle <= 10; controle++) {
			System.out.printf("F(%d) = %d\n", controle, sequencia(controle));
		}
	}
}
