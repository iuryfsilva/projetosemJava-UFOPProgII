package testerecursao;

public class FatorialRecursivo {
	public long fatorial(long numero) {
		if(numero <= 1) {
			return 1;//casos básicos 0! = 1 e 1! = 1
		}else {//passo recursão
			return numero * fatorial(numero - 1);
		}
	}
	
	public void imprimeFatorial() {
		for (int controle = 0;  controle <= 10; controle++) {
			System.out.printf("%d! = %d \n", controle, fatorial(controle));
		}
	}
}
