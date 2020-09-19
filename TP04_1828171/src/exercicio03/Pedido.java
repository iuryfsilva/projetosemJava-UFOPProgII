package exercicio03;

public class Pedido {
	private float valor_total;
	private ItemPedido vetorItem[];
	private ItemPedido item;
	private int contadorItens = 0;
	
	// Métodos Especiais
	public Pedido(Produto produto, int quantidade) {
		this.vetorItem = new ItemPedido[5];
		this.setValor_Total(0);
		this.item = new ItemPedido(produto, quantidade);
		this.adicionar_item(this.item);
		this.contadorItens++;	
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
	}
	
	public float obter_total() {
		for(int controle = 0; controle < this.contadorItens; controle++) {
			this.setValor_Total(this.getValor_Total() + (this.vetorItem[controle].getQuantidade() * 
								this.vetorItem[controle].getProduto().getValor()));
		}
		float valorTotal = this.getValor_Total();
		return valorTotal;
	}
	
	public void preencheItemPedido(ItemPedido item[]){
		
	}
	
	
}
