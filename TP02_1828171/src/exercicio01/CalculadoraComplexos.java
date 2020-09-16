package exercicio01;
import java.util.Scanner;

public class CalculadoraComplexos {
	private Scanner teclado = new Scanner(System.in);
		
	private double valor1, valor2, resultadoReal, divisao;//soma, subtracao, multiplicacao 
	private double resultadoImaginario, parteImaginariaB1, parteImaginariaB2;
	private int expoenteZ1, expoenteZ2, expoenteZResultante;
	private String operacao, numeroComplexoResultante;
		
	//Métodos Especiais
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

	/*
	 * public double getSoma() { return this.soma; } public void setSoma(double
	 * soma) { this.soma = soma; }
	 * 
	 * public double getSubtracao() { return this.subtracao; } public void
	 * setSubtracao(double subtracao) { this.subtracao = subtracao; }
	 * 
	 * public double getMultiplicacao() { return this.multiplicacao; } public void
	 * setMultiplicacao(double multiplicacao) { this.multiplicacao = multiplicacao;
	 * }
	 */
	public double getDivisao() {
		return this.divisao;
	}
	public void setDivisao(double divisao) {
		this.divisao = divisao;
	}

	public double getParteImaginariaB1() {
		return this.parteImaginariaB1;
	}
	public void setParteImaginariaB1(double parteImaginariaB1) {
		this.parteImaginariaB1 = parteImaginariaB1;
	}
	
	public double getParteImaginariaB2() {
		return this.parteImaginariaB2;
	}
	public void setParteImaginariaB2(double parteImaginariaB2) {
		this.parteImaginariaB2 = parteImaginariaB2;
	}
	
	public double getResultadoReal() {
		return this.resultadoReal;
	}
	public void setResultadoReal(double resultadoReal) {
		this.resultadoReal = resultadoReal;
	}
	
	public double getResultadoImaginario() {
		return this.resultadoImaginario;
	}
	public void setResultadoImaginario(double resultadoImaginario) {
		this.resultadoImaginario = resultadoImaginario;
	}
	
	public int getExpoenteZ1() {
		return this.expoenteZ1;
	}
	public void setExpoenteZ1(int expoenteZ1) {
		this.expoenteZ1 = expoenteZ1;
	}
	
	public int getExpoenteZ2() {
		return this.expoenteZ2;
	}
	public void setExpoenteZ2(int expoenteZ2) {
		this.expoenteZ2 = expoenteZ2;
	}
	
	public int getExpoenteZResultante() {
		return this.expoenteZResultante;
	}
	public void setExpoenteZResultante(int expoenteZResultante) {
		this.expoenteZResultante = expoenteZResultante;
	}
		
	public String getOperacao() {
		return this.operacao;
	}
	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
	
	public String getNumeroComplexoResultante() {
		return this.numeroComplexoResultante;
	}
	public void setNumeroComplexoResultante(String numeroComplexoResultante) {
		this.numeroComplexoResultante = numeroComplexoResultante;
	}
	
	//Métodos Personalizados
	
	public void execultaCalculadora() {
		
		//Scanner teclado = new Scanner(System.in);
			
		System.out.println("Informe o primeiro valor: ");
		this.setValor1(teclado.nextDouble());
			
		System.out.println("Operação: ");
		this.setOperacao(teclado.next());//não funciona se usar com .nextLine(),
										 //poderia usar o (char)System.in.read();
		
		System.out.println("Informe o Segundo valor: ");
		this.setValor2(teclado.nextDouble()); 
		
		//System.out.println(this.getOperacao());
			
		this.operacaoNumerosReais();
				
		//teclado.close();
	}
	public void execultaCalculadoraComplexos() {
		
		System.out.println("Informe a parte real do primeiro numero complexo: ");
		this.setValor1(teclado.nextDouble());
		System.out.println("Informe a parte imaginária do primeiro numero complexo: ");
		this.setParteImaginariaB1(teclado.nextDouble());
		System.out.println("Informe o expoente do i no primeiro numero complexo: ");
		this.setExpoenteZ1(teclado.nextInt());
		System.out.println(geraStringNumeroComplexo(this.getValor1(), 
						   this.getParteImaginariaB1(), this.getExpoenteZ1()));
		
		System.out.println("Informe a parte real do segundo numero complexo: ");
		this.setValor2(teclado.nextDouble());
		System.out.println("Informe a parte imaginária do segundo numero complexo: ");
		this.setParteImaginariaB2(teclado.nextDouble());
		System.out.println("Informe o expoente do i no segundo numero complexo: ");
		this.setExpoenteZ2(teclado.nextInt());
		System.out.println(geraStringNumeroComplexo(this.getValor2(), 
						   this.getParteImaginariaB2(), this.getExpoenteZ2()));
		//System.out.println(this.getOperacao());

		System.out.println("Operação: ");
		this.setOperacao(teclado.next());//não funciona se usar o .nextLine(),
										 //poderia usar o (char)System.in.read();
		
		
		this.operacaoNumerosComplexos();
				
		//teclado.close();
	}
	
	public void operacaoNumerosReais() {
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
		default:
			System.out.println("Operação não cadastrada!");
			System.out.println(this.getOperacao());
			break;
		}
	}
	public void operacaoNumerosComplexos() {
		switch (this.getOperacao()){
		case "/":
			this.divisaoComplexo();
			System.out.println("Resultado: " + this.getNumeroComplexoResultante());
			break;
		case "*":
			this.multiplicacaoComplexo(this.getValor1(), this.getValor2(), this.getExpoenteZ1(), this.getExpoenteZ2(),
					  				   this.getParteImaginariaB1(), this.getParteImaginariaB2());
			System.out.println("Resultado: " + this.getNumeroComplexoResultante());
			break;
		case "-":
			this.subtracaoComplexo();
			System.out.println("Resultado: " + this.getNumeroComplexoResultante());
			break;
		case "+":
			this.somaComplexo();
			System.out.println("Resultado: " + this.getNumeroComplexoResultante());
			break;
		default:
			System.out.println("Operação não cadastrada!");
			System.out.println(this.getOperacao());
			break;
		}
	}
	
	/*
	*Calculo de numeros complexos
	*
	*Numeros complexos: Forma algébrica 
	*
	*Z = a + bi, onde "a" corresponde a parte real e "b" corresponde a parte imaginária,
	*com  a e b pertencentes aos Reais.
	*
	*##Considerar que i^2= -1.
	*
	*SOMA/SUBTRAÇÃO: Operar os reais com reais e comlexos com complexos
	*
	*ex: (15 + 5i) + (2 + 13i) = 17 + 18i
	*
	*MULTIPLICAÇAO: 
	*
	*Consiste na distributiva entre os dois complexos lembrando de Considerar que i^2= -1
	*
	*DIVISÃO
	*
	*Multiplicar o numerador e denominador pelo conjugaldo do denominador
	*
	*/
	
	public String geraStringNumeroComplexo(double parteReal, double parteImaginaria, int expoenteDoI) {
		String stringNumeroComplexo = "";
		
		if(parteImaginaria < 0)
			stringNumeroComplexo = "(" + parteReal + " " + parteImaginaria + "i^" + expoenteDoI + ")";
		else
			stringNumeroComplexo = "(" + parteReal + " + " + parteImaginaria + "i^" + expoenteDoI + ")";
		
		return stringNumeroComplexo;
	}
	
	public void trataExpoenteDoI(int expoenteZ1) {
		if(expoenteZ1 % 4 == 0) {
			System.out.println("Por enquanto é isso!");
		}else if(expoenteZ1 % 4 == 1) {
			
		}else if(expoenteZ1 % 4 == 2) {
			
		}else if(expoenteZ1 % 4 == 3) {
			
		}
	}
	
	public double soma(double valor1, double valor2) {
		double soma = (valor1 + valor2);
		return soma;
	}
	public void somaComplexo() {
		this.setResultadoReal(this.soma(this.getValor1(), this.getValor2()));
		if(this.getExpoenteZ1() == this.getExpoenteZ2()) {
			this.setResultadoImaginario(this.soma(this.getParteImaginariaB1(), this.getParteImaginariaB2()));
			this.setExpoenteZResultante(this.getExpoenteZ1());
			this.setNumeroComplexoResultante(this.geraStringNumeroComplexo(this.getResultadoReal(),
					this.getResultadoImaginario(), this.getExpoenteZResultante()));
		}else {
			trataExpoenteDoI(this.getExpoenteZ1());
		}
		
	}
	
	public double subtracao(double valor1, double valor2) {
		double subtracao = (valor1 - valor2);
		return subtracao;
	}
	public void subtracaoComplexo() {
		this.setResultadoReal(this.subtracao(this.getValor1(), this.getValor2()));
		if(this.getExpoenteZ1() == this.getExpoenteZ2()) {
			this.setResultadoImaginario(this.subtracao(this.getParteImaginariaB1(), this.getParteImaginariaB2()));
			this.setExpoenteZResultante(this.getExpoenteZ1());
			this.setNumeroComplexoResultante(this.geraStringNumeroComplexo(this.getResultadoReal(),
					this.getResultadoImaginario(), this.getExpoenteZResultante()));
		}else {
			trataExpoenteDoI(this.getExpoenteZ1());
		}
	}
	 
	/*Abstração da propriedade distributiva 
	 * 
	 * (a1*b1) + ((a1*bi2) + (a2*bi1)) + (bi1*bi2)
	 *   
	 *  Caso I         Caso II            Caso III
	 *  (Real)       (complexo) 	(depende do expoente)
	 * 
	 *  
	*/
			
	public double multiplicacao(double valor1, double valor2) {
		double multiplicacao = (valor1 * valor2);
		return multiplicacao;
	}
	public void multiplicacaoComplexo(double valor1, double valor2, int expoenteZ1, int expoenteZ2,
									  double parteImaginariaB1, double parteImaginariaB2) {
		
		//Realiza a multiplicação da parte real dos numeros informados
		//Caso I
		//this.multiplicacao(this.getValor1(), this.getValor2());
			
		
		//Caso II
		if(expoenteZ1 == expoenteZ2) {
			this.setResultadoImaginario(this.soma(this.multiplicacao(valor1, parteImaginariaB2),
										this.multiplicacao(valor2, parteImaginariaB1)));
			
			this.setExpoenteZResultante(expoenteZ1);
		}else {
			trataExpoenteDoI(expoenteZ1);
			trataExpoenteDoI(expoenteZ2);
		}
		
		//Caso III
		double auxiliarParteImaginaria = (this.multiplicacao(parteImaginariaB1, parteImaginariaB2));
		int auxiliarExpoenteZResultante = (expoenteZ1 + expoenteZ2);
		//Chama o metodo trata expoente para saber se ele será 2 se for já substitui por -1 e ja efetua a soma
		//this.trataExpoenteDoI(this.getExpoenteZResultante());
		if(auxiliarExpoenteZResultante == 2) {
			this.setResultadoReal(this.soma(this.multiplicacao(valor1, valor2), 
											this.multiplicacao(auxiliarParteImaginaria, (-1))));
			this.setNumeroComplexoResultante(this.geraStringNumeroComplexo(this.getResultadoReal(), 
											 this.getResultadoImaginario(), this.getExpoenteZResultante()));
		}else
			System.out.println("Falta fazer o tratamento do expoente de i");
		
	}
	 
	public void divisao(double numerador, double denominador) {
		if(denominador != 0)
			this.setDivisao(numerador / denominador);
		else
			System.out.println("Não é possivel realizar divisões por 0");
	}
	public void divisaoComplexo() {
		
		//double conjulgadoDenominador = this.multiplicacao(this.getParteImaginariaB2(), (-1));
		
		
		this.multiplicacaoComplexo(this.getValor1(), this.getValor2(), this.getExpoenteZ1(), this.getExpoenteZ2(),
								   this.getParteImaginariaB1(), this.multiplicacao(this.getParteImaginariaB2(), (-1)));
		
		String auxiliarResultadoDivNumComplex = this.getNumeroComplexoResultante();
		
		this.multiplicacaoComplexo(this.getValor2(), this.getValor2(), this.getExpoenteZ2(), this.getExpoenteZ2(),
				   this.getParteImaginariaB2(), this.multiplicacao(this.getParteImaginariaB2(), (-1)));
		
		System.out.println("String do numero complexo resultante da divisão, invocar getNumeroComplexoResultante ");
		this.setNumeroComplexoResultante(auxiliarResultadoDivNumComplex + " / " + this.getNumeroComplexoResultante());
		
		

		//double auxiliarParteImaginaria = this.getResultadoImaginario();
		//int auxiliarExpoenteZResultante = ;
		
	}
	  
	 
		
}
