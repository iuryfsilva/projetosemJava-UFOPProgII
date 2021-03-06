package exercicio02;

import java.util.Scanner;

public class Matriz {
	
	private static Scanner teclado = new Scanner(System.in);
	private int numeroDeLinhas, numeroDeColunas;
	private int matriz[][] = new int[numeroDeLinhas][numeroDeColunas];
	

	//M�todos Especiais
	public Matriz(int numeroDeLinhas, int numeroDeColunas) {
		this.setNumeroDeLinhas(numeroDeLinhas);
		this.setNumeroDeColunas(numeroDeColunas);
		this.setMatriz(this.tamanhoMatriz(numeroDeLinhas, numeroDeColunas));
	}

	public int getNumeroDeLinhas() {
		return this.numeroDeLinhas;
	}
	public void setNumeroDeLinhas(int numeroDeLinhas) {
		this.numeroDeLinhas = numeroDeLinhas;
	}

	public int getNumeroDeColunas() {
		return this.numeroDeColunas;
	}
	public void setNumeroDeColunas(int numeroDeColunas) {
		this.numeroDeColunas = numeroDeColunas;
	}
	
	public int[][] tamanhoMatriz(int numeroDeLinhas, int numeroDeColunas){
		return new int[numeroDeLinhas][numeroDeColunas];
	}
	public int[][] getMatriz() {
		return this.matriz;
	}
	public void setMatriz(int[][] matriz) {
		this.matriz = matriz;
	}
	
	
	//M�todos Personalizados
	public void numeroDeLinhasDaMatriz() {
		System.out.println("Numero de linhas: " + this.getNumeroDeLinhas());		
	}
	public void numeroDeColunasDaMatriz() {
		System.out.println("Numero de colunas: " + this.getNumeroDeColunas());
	}

	public void preencheMatrizPosicaoPorPosicao() {
		for(int controleX = 0; controleX < this.getNumeroDeLinhas(); controleX++) {
			for(int controleY = 0; controleY < this.getNumeroDeColunas(); controleY++) {
				System.out.printf("Informe o valor da posi��o[%d][%d]: \n", controleX, controleY);
				this.matriz[controleX][controleY] = teclado.nextInt();
			}
		}
	}
	public void editarMatrizPosicaoPorPosicao(int numeroDaLinha, int numeroDaColuna) {
		if(numeroDaLinha < this.getNumeroDeLinhas() && numeroDaColuna < this.getNumeroDeColunas()) {
			System.out.println("Informe o novo valor para a posi��o desejada: ");
			this.matriz[numeroDaLinha][numeroDaColuna] = teclado.nextInt();
		}
	}
	
	public void transporMatriz() {
		if(this.getNumeroDeLinhas() == this.getNumeroDeColunas()) {
			int matrizAuxiliar[][] = new int[this.getNumeroDeColunas()][this.getNumeroDeColunas()];
			for(int controleX = 0; controleX < this.matriz.length; controleX++) {
				for(int controleY = 0; controleY < this.matriz.length; controleY++) {
					matrizAuxiliar[controleY][controleX] = this.matriz[controleX][controleY];
				}
			}
			this.setMatriz(matrizAuxiliar);
		}
	}
	
	public void apresentaMatrizNoConsole() {
		for(int controleX = 0; controleX < this.matriz.length; controleX++) {
			for(int controleY = 0; controleY < this.matriz[controleX].length; controleY++) {
				System.out.print(this.matriz[controleX][controleY] + "  ");
			}
			System.out.println();
		}
	}
	
	public void executaTestes() {
		this.numeroDeLinhasDaMatriz();
		this.numeroDeColunasDaMatriz();
		this.preencheMatrizPosicaoPorPosicao();
		this.apresentaMatrizNoConsole();	
		System.out.println("Informe a linha da matriz que deseja editar: ");
		int linhaInformada = teclado.nextInt();
		System.out.println("Informe a coluna da matriz que deseja editar: ");
		int colunaInformada = teclado.nextInt();
		this.editarMatrizPosicaoPorPosicao(linhaInformada, colunaInformada);
		this.transporMatriz();
		this.apresentaMatrizNoConsole();	
	}

}
