package exercicio8;

public class TestaAdaptadorFarenheitCelsius {

	public static void main(String[] args) {
		
		MedidorFarenheit tempFarenheit = new MedidorFarenheit();
		
		System.out.printf("Temperatura em Farenheit: %.4f\n", tempFarenheit.getTemperaturaFarenheit());

		
		AdaptadorFarenheitCelsius adaptador = new AdaptadorFarenheitCelsius(tempFarenheit);
		
		System.out.printf("Temperatura em Celsius: %.4f\n", adaptador.medirTemperatura());
		
	}
	
}
