package exercicio03;
import java.util.Scanner;

public class EquacaoAfim {
	private Scanner teclado = new Scanner(System.in);

	private double coeficienteAngular, coeficienteLinear, valorX, valorY;

	//Métodos Especiais
	public double getCoeficienteAngular() {
		return this.coeficienteAngular;
	}
	public void setCoeficienteAngular(double coeficienteAngular) {
		this.coeficienteAngular = coeficienteAngular;
	}

	public double getCoeficienteLinear() {
		return this.coeficienteLinear;
	}
	public void setCoeficienteLinear(double coeficienteLinear) {
		this.coeficienteLinear = coeficienteLinear;
	}

	public double getValorX() {
		return this.valorX;
	}
	public void setValorX(double valorX) {
		this.valorX = valorX;
	}

	public double getValorY() {
		return this.valorY;
	}
	public void setValorY(double valorY) {
		this.valorY = valorY;
	}
	
	//Métodos Personalizados
	public void representaReta() {
		System.out.println("Informe o valor do coeficiente angular: ");
		this.setCoeficienteAngular(teclado.nextDouble());
		System.out.println("Informe o valor do coeficiente Linear: ");
		this.setCoeficienteLinear(teclado.nextDouble());
		
		System.out.println(this.geraStringReta());
		
		double coordenadaX, coordenadaY;
		System.out.println("Informe o valor da coordenada x, do ponto a ser verificado: ");
		coordenadaX = teclado.nextDouble();
		System.out.println("Informe o valor da coordenada y, do ponto a ser verificado: ");
		coordenadaY = teclado.nextDouble();
		System.out.println("Resultado da verificação: " + this.verificaPontoNaReta(coordenadaX, coordenadaY));
		
		this.verificaPontoIntersecao();
		
	}

	public boolean verificaPontoNaReta(double coordenadaX, double coordenadaY) {
		this.setValorY((this.getCoeficienteAngular() * coordenadaX) + (this.getCoeficienteLinear()));
		if(this.getValorY() == coordenadaY)
			return true;
		else
			return false;
	}

	public String geraStringReta() {
		String stringReta = "";
		if(this.getCoeficienteLinear() < 0) {
			stringReta = "y = " + this.getCoeficienteAngular() +"x " + this.getCoeficienteLinear();
		}else {
			stringReta = "y = " + this.getCoeficienteAngular() + "x + " + this.getCoeficienteLinear();
		}
		return stringReta;
	}
	
	public void verificaPontoIntersecao() {
		double coeficienteAngularAux, coeficienteLinearAux;
		
		System.out.println("==Forneça os valores para a segunda reta==");
		System.out.println("Informe o valor do coeficiente angular: ");
		coeficienteLinearAux = teclado.nextDouble();
		System.out.println("Informe o valor do coeficiente Linear: ");
		coeficienteAngularAux = teclado.nextDouble();
		
		if(this.getCoeficienteAngular() == coeficienteAngularAux) {
			System.out.println("Retas PARALELAS! ");
		}else {
			if((this.getCoeficienteAngular() * coeficienteAngularAux) == -1) 
				System.out.println("Retas PERPENDICULARES! ");
			this.setValorX(((this.getCoeficienteLinear() * (-1)) + coeficienteLinearAux) / 
						   (this.getCoeficienteAngular() + (coeficienteAngularAux * (-1))));
			this.setValorY((this.getCoeficienteAngular() * this.getValorX()) + this.getCoeficienteLinear());
			System.out.printf("Ponto de interseção das retas: (%.2f , %.2f) \n", this.getValorX(), this.getValorY());	
		}
	}
	
	
	
}
