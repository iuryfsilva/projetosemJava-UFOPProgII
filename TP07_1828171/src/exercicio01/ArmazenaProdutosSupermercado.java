package exercicio01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ArmazenaProdutosSupermercado {

	public static void main(String[] args) {

		Set<Produto> setOfProducts = new HashSet<Produto>();
		
		Scanner teclado = new Scanner(System.in);
		
		int escolha = 0;
		String nome = "";
		float preco;
		int ID;
		
		boolean controle = true;
		while(controle) {
			System.out.println("Informe a opção desejada: 1- Inserir/ 2- Sair");
			escolha = teclado.nextInt();
						
			switch (escolha){
				case 1:
					System.out.println("Informe o ID do produto: ");
					ID = teclado.nextInt(); 
					System.out.println("Informe o nome do produto: ");
					nome = teclado.next(); 
					System.out.println("Informe o preço do produto: ");
					preco = teclado.nextFloat(); 
					
					Produto novoProduto = new Produto(ID, preco, nome);
					
					if(setOfProducts.contains(novoProduto) == false)
						setOfProducts.add(novoProduto);
					else
						System.out.println("Erro: Produto já presente no set");
					continue;
				case 2:
					controle = false;
					break;
			}
				
		}
		
		for (Produto produtoCorrente: setOfProducts) {
			System.out.println("------------------");
			System.out.println(produtoCorrente.toString());
		}
		
		teclado.close();
		
	}

}
