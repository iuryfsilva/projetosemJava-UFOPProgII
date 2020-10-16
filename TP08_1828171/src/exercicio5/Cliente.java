package exercicio5;

public class Cliente{
	public static void main(String[] args) {

		FabricaDeCarro fabricaDeCarro = new FabricaFiat();
		
		CarroSedan sedanFiat = fabricaDeCarro.criarCarroSedan();
		sedanFiat.exibirInfoSedan();
		CarroPopular popularFiat = fabricaDeCarro.criarCarroPopular();
		popularFiat.exibirInfoPopular();
		
		fabricaDeCarro = new FabricaFord();
		
		CarroSedan sedanFord = fabricaDeCarro.criarCarroSedan();
		sedanFord.exibirInfoSedan();
		CarroPopular popularFord = fabricaDeCarro.criarCarroPopular();
		popularFord.exibirInfoPopular();
		
	}
}
