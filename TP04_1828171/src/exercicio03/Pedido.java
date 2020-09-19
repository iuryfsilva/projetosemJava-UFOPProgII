package exercicio03;

import java.util.Scanner;

public class Pedido {
	private float valor_total;
	private ItemPedido vetorItem[];
	private ItemPedido item;
	private int contadorItens = 0;
	Scanner teclado = new Scanner(System.in); 

	// Métodos Especiais
	public Pedido(Produto produto, int quantidade) {
		this.vetorItem = new ItemPedido[5];
		this.item = new ItemPedido(produto, quantidade);
		this.adicionar_item(this.item);	
	}
	
	public Pedido(Produto listaProduto[]) {
		this.vetorItem = new ItemPedido[listaProduto.length];
		ItemPedido novosItens[] = new ItemPedido[listaProduto.length];
		for(int controle = 0; controle < listaProduto.length; controle++) {
			System.out.println("Informe quantidade do produto " + listaProduto[controle].getDescricao() + ": ");
			int quantidadeDoProduto = teclado.nextInt();
			novosItens[controle] = new ItemPedido(listaProduto[controle], quantidadeDoProduto);
		}
		for(int controle = 0; controle < listaProduto.length; controle++) {
			this.adicionar_item(novosItens[controle]);
		}
	}
	
	public float getValor_Total() {
		return this.valor_total;
	}
	public void setValor_Total(float valorTotal) {
		this.valor_total = valorTotal;
	}
	
	// Métodos Personalizados
	public void adicionar_item(ItemPedido item) {
		this.vetorItem[contadorItens] = item;
		this.contadorItens++;
	}
	
	public float obter_total() {
		for(int controle = 0; controle < this.contadorItens; controle++) {
			this.setValor_Total(this.getValor_Total() + (this.vetorItem[controle].getQuantidade() * 
								this.vetorItem[controle].getProduto().getValor()));
		}
		float valorTotal = this.getValor_Total();
		return valorTotal;
	}
	
	

	  
	 
}
