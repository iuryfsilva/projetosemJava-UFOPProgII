package suprimentosinformatica;

public class Invoice {
	
	private int itemFaturado;
	private String descricao;
	private int quantidadeItens;
	private double valorItem;
	
	public Invoice(int itemFaturado, String descricao, int quantidadeItens, double valorItem) {
		
		this.itemFaturado = itemFaturado;
		this.descricao =  descricao;
		if(quantidadeItens > 0) {
			this.quantidadeItens = quantidadeItens;
		}else {
			this.quantidadeItens = 0;
		}
		
		if(valorItem > 0){
			this.valorItem = valorItem;
		}else {
			this.valorItem = 0.0;
		}
	}
	
	public int getItemFaturado() {
		return itemFaturado;
	}
	
	public void setItemFaturado(int itemFaturado) {
		this.itemFaturado = itemFaturado;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getQuantidadeItens() {
		return quantidadeItens;
	}
	
	public void setQuantidadeItens(int quantidadeItens) {
		this.quantidadeItens = quantidadeItens;
	}
		
	public double getValorItem(){
		return valorItem;
	}

	public void setValorItem(double valorItem){
		this.valorItem = valorItem;
	}
	
	public double getInvoiceAmount() {
		return (this.valorItem * this.quantidadeItens);
	}
	
}
