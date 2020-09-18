package exercicio03;

public class ItemPedido {

	private int quantidade;
	private Produto produto;
	
	public ItemPedido(Produto produto, int quantidade) {
		this.setProduto(produto);
		this.setQuantidade(quantidade);
	}

	public Produto getProduto() {
		return this.produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return this.quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
