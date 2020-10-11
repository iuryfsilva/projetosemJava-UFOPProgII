package exercicio10;

import java.util.InputMismatchException;
import java.util.Scanner;
import ExcecoesTP07.InvalidOperationException;

public class Calculator {
	private Scanner teclado = new Scanner(System.in);
	private double valor1, valor2, divisao;
	private String operacao;
	
	// Métodos Especiais
	public double getValor1() {
		return this.valor1;
	}
	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}

	public double getValor2() {
		return this.valor2;
	}
	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}

	public double getDivisao() {
		return this.divisao;
	}
	public void setDivisao(double divisao) {
		this.divisao = divisao;
	}

	public String getOperacao() {
		return this.operacao;
	}
	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	
	// Métodos Personalizados
	public void execultaCalculadora()  throws InvalidOperationException, 
										InputMismatchException, ArithmeticException{
			
		System.out.println("Informe o primeiro valor: ");
		this.setValor1(teclado.nextDouble());
			
		System.out.println("Operação: ");
		this.setOperacao(teclado.next());//não funciona se usar com .nextLine(),
										 //poderia usar o (char)System.in.read();
		if(this.getOperacao().equalsIgnoreCase("l") == false) {
			System.out.println("Informe o Segundo valor: ");
			this.setValor2(teclado.nextDouble()); 
		}
				
		this.operacaoNumerosReais();
		
	}
	
	public void operacaoNumerosReais() throws InvalidOperationException, 
	 								 InputMismatchException, ArithmeticException{
		
		switch (this.getOperacao()){
		case "/":
			this.divisao(this.getValor1(), this.getValor2());
			System.out.println("Resultado: " + this.getDivisao() + " ");
			break;
		case "*":
			System.out.println("Resultado: " + this.multiplicacao(this.getValor1(), this.getValor2()));
			break;
		case "-":
			System.out.println("Resultado: " + this.subtracao(this.getValor1(), this.getValor2()));
			break;
		case "+":
			System.out.println("Resultado: " + this.soma(this.getValor1(), this.getValor2()));
			break;
		case "d":
			System.out.println("Resultado divisão: " + this.div(this.getValor1(), this.getValor2()));
			break;
		case "D":
			System.out.println("Resultado divisão: " + this.div(this.getValor1(), this.getValor2()));
			break;
		case "L":
			System.out.println("Resultado log10: " + this.log10(this.getValor1()));
			break;
		case "l":
			System.out.println("Resultado log10: " + this.log10(this.getValor1()));
			break;	
		default:
			throw new InvalidOperationException("Operação não cadastrada - " + this.getOperacao());
		}
	}

	public double soma(double valor1, double valor2) {
		double soma = (valor1 + valor2);
		return soma;
	}
	
	public double subtracao(double valor1, double valor2) {
		double subtracao = (valor1 - valor2);
		return subtracao;
	}

	public double multiplicacao(double valor1, double valor2) {
		double multiplicacao = (valor1 * valor2);
		return multiplicacao;
	}

	public void divisao(double numerador, double denominador) {
		if(denominador != 0)
			this.setDivisao(numerador / denominador);
		else
			System.out.println("Não é possivel realizar divisões por 0");
	}

	public double div(double valorA, double valorB) {
		return (valorA/ valorB);
	}
	
	public double log10(double valor) {
		return Math.log10(valor);
	}


}
