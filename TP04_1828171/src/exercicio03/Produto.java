package exercicio03;

public class Produto {

	private int codigo;
	private float valor;
	private String descricao;
	
	// Métodos Especiais
	public Produto(int codigo, float valor, String descricao) {
		this.setCodigo(codigo);
		this.setValor(valor);
		this.setDescricao(descricao);
	}

	public int getCodigo() {
		return this.codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public float getValor() {
		return this.valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
			
	
}
