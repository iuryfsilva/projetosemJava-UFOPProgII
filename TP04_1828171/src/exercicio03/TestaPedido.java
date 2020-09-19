package exercicio03;

public class TestaPedido {

	public static void main(String[] args) {

		Produto margarina = new Produto(001, 20, "margarina");
		//ItemPedido item = new ItemPedido(margarina, 8);
		
		Pedido novoPedido = new Pedido(margarina, 8);
		//System.out.println("Valor Total: ");
		System.out.println(novoPedido.obter_total());
		
	}

}
