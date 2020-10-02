package exercicio06;

public class TestaVeiculos {

	public static void main(String[] args) {
		
		Bicicleta bike = new Bicicleta();
		System.out.println("Acelerou: " + bike.acelerar(15.5f));
		System.out.println("Velocidade da Bicicleta: " + bike.getVelocidade());
		System.out.println("Acelerou: " + bike.acelerar(15.5f));
		System.out.println("Velocidade da Bicicleta: " + bike.getVelocidade());
		bike.parar();
		System.out.println("Parou a Bicicleta ");
		System.out.println("Velocidade da Bicicleta: " + bike.getVelocidade());


		Automovel carro = new Automovel();
		System.out.println("Acelerou: " + carro.acelerar(15.5f));
		carro.parar();
		carro.trocarOleo(4.5f);
		System.out.println("Acelerou: " + carro.acelerar(20));
		System.out.println("Velocidade do Carro: " + carro.getVelocidade());
		carro.parar();
		System.out.println("Parou o carro ");
		System.out.println("Velocidade do Carro: " + carro.getVelocidade());

	}

}
