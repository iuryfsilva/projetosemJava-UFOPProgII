package exercicio04;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Metodos04 funcao = new Metodos04();
		//funcao.execultar();
		long dados[][] = new long[1][4];
		funcao.preencheMatriz(dados);
		funcao.imprimeMatriz(dados);
		funcao.maiorCRcurso(dados);
	}
	
}
