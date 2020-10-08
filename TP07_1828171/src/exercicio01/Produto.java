package exercicio01;

public class Produto {

	private int ID;
	private float valor;
	private String nome;
	
	// Métodos Especiais
	public Produto(int ID, float valor, String nome) {
		this.setID(ID);
		this.setValor(valor);
		this.setNome(nome);
	}

	public int getID() {
		return this.ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	
	public float getValor() {
		return this.valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
			
	@Override
	public boolean equals(Object obj) {
		Produto produto = (Produto)obj;
		if(this.getID() == produto.getID())
			return true;
		else
			return false;
	}
	
	@Override
	public int hashCode() {
		return this.getID();
	}
	
	@Override
	public String toString() {
		String string = "ID: " + this.getID();
		string += "\nNome: " + this.getNome();
		string += "\nPreço: " + this.getValor();
		return string;
	}
	
}
