package exercicio03;

public class TestaPedido {

	public static void main(String[] args) {

		Produto margarina = new Produto(001, 20, "margarina");
		Produto sabao = new Produto(002, 1, "Sabão");
		ItemPedido item = new ItemPedido(sabao, 5);
		
		Pedido novoPedido = new Pedido(margarina, 8);
		novoPedido.adicionar_item(item);
		System.out.println("Valor Total: ");
		System.out.println(novoPedido.obter_total());
		
	}

}
