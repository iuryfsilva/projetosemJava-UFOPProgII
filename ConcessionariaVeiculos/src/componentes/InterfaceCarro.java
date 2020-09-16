package componentes;

public interface InterfaceCarro {
	
	//M�todos Abstratos
	public abstract void aumentaValor(float aumento);
	public abstract void diminuiValor(float reducao);
	public abstract void mudarPlaca(String novaPlaca);
	public abstract void mudarcor(String novaCor);
	public abstract void dadosCarro();
	public abstract void venderCarro();
	public abstract void consultaRapida();
	
	//M�todos para inserir na proxima revis�o
	//public abstract void quantidadeEstoque();
	public abstract void adicionarAoEstoque();
	public abstract void baixarDoEstoque();
}
