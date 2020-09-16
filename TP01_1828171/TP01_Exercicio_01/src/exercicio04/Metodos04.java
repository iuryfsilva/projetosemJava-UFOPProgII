package exercicio04;

import java.util.Scanner;

public class Metodos04 {
	
	public void preencheMatriz(long matriz[][]) {
		
		Scanner teclado = new Scanner(System.in);
		
		for(int controleX = 0; controleX < matriz.length; controleX++) {	
			for(int controleY = 0; controleY < matriz[controleX].length; controleY++) {
				switch (controleY) {
						case 0:
							System.out.println("Matrícula: ");	
							matriz[controleX][controleY] = teclado.nextLong();
							continue;
						case 1:
							System.out.println("Sexo: [0 - Feminino/ 1 - Masculino]  ");
							matriz[controleX][controleY] = teclado.nextLong();
							continue;
						case 2:
							String stringCodCurso = "";
							for(int controleCodCurso = 3; controleCodCurso <= 6; controleCodCurso++) {
								stringCodCurso += Long.toString(matriz[controleX][0]).charAt(controleCodCurso);  
							}
							matriz[controleX][controleY] = Long.parseLong(stringCodCurso);
							System.out.printf("Código curso: %d\n", matriz[controleX][controleY]);
							continue;
						case 3:
							System.out.println("CR: ");
							matriz[controleX][controleY] = teclado.nextLong();
							System.out.println();
							continue;		
				}
			}
		}
		//teclado.close();
	}
		
	public void imprimeMatriz(long matriz[][]) {
		
		System.out.println("| Matrícula   |      Sexo      | Código do Curso |     CR     |");
		
		for(int controleX = 0; controleX < matriz.length; controleX++) {	
			for(int controleY = 0; controleY < matriz[controleX].length; controleY++) {
				switch (controleY) {
						case 0:
							System.out.print("  " + matriz[controleX][controleY] + "  ");
							continue;
						case 1:
							if(matriz[controleX][controleY] == 0) {
								System.out.print("    Feminino    ");							
							}else if(matriz[controleX][controleY] == 1){
								System.out.print("    Masculino   ");							
							}else System.out.print("  Não cadastrado");
							continue;
						case 2:
							System.out.print("       " + matriz[controleX][controleY] + "       ");
							continue;
						case 3:
							System.out.print("       " + matriz[controleX][controleY] + "       ");
							continue;		
				}
			}
			System.out.println(" ");
		}
		System.out.println("_______________________________________________________________\n");
	}
	
	public void maiorCRcurso(long matriz[][]) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o codigo do curso: ");
		int codigoCurso = teclado.nextInt();
		long cr = 0;
		int indice = 404;
		
		for(int controle = 0; controle < matriz.length; controle++) {
			if(matriz[controle][2] ==codigoCurso) {
				if(cr < matriz[controle][3]) {
					cr = matriz[controle][3];
					indice = controle;
				}
			}
		}
		if(indice != 404) {
			System.out.println("\n====Aluna(o) com maior CR====");
			System.out.println("Matrícula: " + matriz[indice][0]);
			System.out.println("Sexo: " + matriz[indice][1]);
			System.out.println("Código do curso: " + matriz[indice][2]);
			System.out.println("CR: " + matriz[indice][3]);
			System.out.println("=============================");
		}else System.out.println("\n!!!!Não encontrado!!!!");
		
		//teclado.close();
		
	}

	public void execultar() {
		long dados[][] = new long[1][4];
		preencheMatriz(dados);
		imprimeMatriz(dados);
		maiorCRcurso(dados);
	}
}
