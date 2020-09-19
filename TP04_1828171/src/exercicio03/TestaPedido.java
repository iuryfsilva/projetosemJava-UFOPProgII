package exercicio03;

import java.util.Scanner;

public class TestaPedido {

	public static void main(String[] args) {
		//Aqui cria novas instancias da classe produto
		Scanner teclado = new Scanner(System.in); 
		
		Produto margarina = new Produto(001, 25.5f, "Margarina");
		Produto produto[] = new Produto[3];
		for(int controle = 0; controle < produto.length; controle++) {
			System.out.println("Informe o código do produto: ");
			int codigoProduto = teclado.nextInt();
			System.out.println("Informe o valor do produto: ");
			float valorProduto = teclado.nextFloat();
			System.out.println("Informe a descrição do produto: ");
			String descricaoProduto = teclado.next();
			produto[controle] = new Produto(codigoProduto, valorProduto, descricaoProduto);	
		}
		
		System.out.println("Pedido 1: ");
		System.out.println("Informe quantidade do produto " + margarina.getDescricao() + ": ");
		int quantidadeDoProduto = teclado.nextInt();
		Pedido novoPedido = new Pedido(margarina, quantidadeDoProduto);
		System.out.println("Valor Total: ");
		System.out.println(novoPedido.obter_total());
		
		System.out.println("Pedido 2: ");
		Pedido pedido2 = new Pedido(produto);
		System.out.println("Valor Total: ");
		System.out.println(pedido2.obter_total());
		
		
		
		teclado.close();
	}

}
