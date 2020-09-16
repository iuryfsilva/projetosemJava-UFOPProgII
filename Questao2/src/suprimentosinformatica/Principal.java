package suprimentosinformatica;

public class Principal {

	public static void main(String[] args) {
		Invoice fatura = new Invoice(001, "Mousepad", 12, 42.65);
		
		System.out.println("Item: " + fatura.getItemFaturado());
		System.out.println("Descricão: " + fatura.getDescricao());
		System.out.println("Quantidade: " + fatura.getQuantidadeItens());
		System.out.println("Valor Unitário: " + fatura.getValorItem());
		System.out.println("Valor Total: " + fatura.getInvoiceAmount());
		
		
		Invoice fatura1 = new Invoice(15, "Teclado Gamer", 2, 35.20);
		
		System.out.println("Item: " + fatura1.getItemFaturado());
		System.out.println("Descricão: " + fatura1.getDescricao());
		System.out.println("Quantidade: " + fatura1.getQuantidadeItens());
		System.out.println("Valor Unitário: " + fatura1.getValorItem());
		System.out.println("Valor Total: " + fatura1.getInvoiceAmount());
		
		Invoice fatura2 = new Invoice(001, "Mousepad", -12, -42.65);
		
		System.out.println("Item: " + fatura2.getItemFaturado());
		System.out.println("Descricão: " + fatura2.getDescricao());
		System.out.println("Quantidade: " + fatura2.getQuantidadeItens());
		System.out.println("Valor Unitário: " + fatura2.getValorItem());
		System.out.println("Valor Total: " + fatura2.getInvoiceAmount());
		
		
	}

}
