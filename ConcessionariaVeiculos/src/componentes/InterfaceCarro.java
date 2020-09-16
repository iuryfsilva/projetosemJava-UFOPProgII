package componentes;

public interface InterfaceCarro {
	
	//Métodos Abstratos
	public abstract void aumentaValor(float aumento);
	public abstract void diminuiValor(float reducao);
	public abstract void mudarPlaca(String novaPlaca);
	public abstract void mudarcor(String novaCor);
	public abstract void dadosCarro();
	public abstract void venderCarro();
	public abstract void consultaRapida();
	
	//Métodos para inserir na proxima revisão
	//public abstract void quantidadeEstoque();
	public abstract void adicionarAoEstoque();
	public abstract void baixarDoEstoque();
}
