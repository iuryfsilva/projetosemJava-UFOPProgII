package exercicio7;

public class TestaCliente {

	public static void main(String[] args) {
		SomadorExistente somadorExistente = new SomadorExistente();
		
		SomadorEsperado somador = new AdaptadorVetorList(somadorExistente);
		
		Cliente cliente = new Cliente(somador);
		cliente.execultar();
		
	}

}
