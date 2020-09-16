package testerecursao2;

public class CalculaFibonacci {

	public long fibonacci(long numero) {
		if((numero == 0) || (numero == 1))//testa casos basicos fibonacci(0) = 0 e fibonacci(1) = 1
			return numero;
		else
			return fibonacci(numero - 1) + fibonacci(numero - 2);
	}
	
	public void imprimeFibonacci(){
		for(int controle = 0; controle <= 10; controle++) {
			System.out.printf("Fibonacci de %d é: %d\n", controle, fibonacci(controle));
		}
	}
}
