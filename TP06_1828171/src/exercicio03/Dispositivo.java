package exercicio03;

public abstract class Dispositivo {

	private String nome;
	private long capacidadeEmBytes;
	
	public Dispositivo(String n, long c) {
		this.nome = n; //falta o this. no exerrcicio esse � o erro estudar a causa para poder explicar
		this.capacidadeEmBytes = c;
	}
	
	
	abstract public String toString();
	abstract public double capacidadeEmMegabytes();
	
	
}
