package componentes;

public class Main {
	
	public static void main(String args[]) {
		
		Carro novoCarro = new Carro("Toro", "AZUL-Turquesa", "XXX0000", 1.8f, 125000.60f);
		
		novoCarro.dadosCarro();
		novoCarro.diminuiValor(25000.55f);
		novoCarro.consultaRapida();
		
		
	}
	
}
