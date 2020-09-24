package exercicio03;

public class Main {

	public static void main(String[] args) {
	 
		Restaurante res1 = new Restaurante("Bom sabor", "sadajkbdnana", "raua shbdahs",
										   "Basjkdnnnc", 00000000, 1234648);
		System.out.println("Restaurante ");
		res1.setTipoComida("Tropeiro");
		res1.setValorPrato(10.99f);
		res1.printRestaurante();
		
		System.out.println("Imprime dados Empresa Restaurante: ");
		res1.printNome();
		res1.printEnderec();
		res1.printTelefone();
		res1.printCep();
		res1.printCidade();
		res1.printEstado();

		
	}

}
