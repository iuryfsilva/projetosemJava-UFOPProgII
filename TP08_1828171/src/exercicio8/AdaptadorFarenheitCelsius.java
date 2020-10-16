package exercicio8;


public class AdaptadorFarenheitCelsius implements MedidorCelsiusIF{

	private MedidorFarenheit objetoFarenheit;


	public AdaptadorFarenheitCelsius(MedidorFarenheit objFarenheit) {
		this.objetoFarenheit = objFarenheit;
	}

	@Override
	public double medirTemperatura() {
		double temperatura = ((this.objetoFarenheit.getTemperaturaFarenheit() - 32)/1.8);
		return temperatura;
	}

}
