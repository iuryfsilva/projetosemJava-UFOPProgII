package exercicio03;

public abstract class Dispositivo {

	private String nome;
	private long capacidadeEmBytes;
	
	public Dispositivo(String n, long c) {
		nome = n; //falta o this. no exerrcicio esse é o erro estudar a causa para poder explicar
		capacidadeEmBytes = c;
	}
	
	
	abstract public String toString();
	abstract public double capacidadeEmMegabytes();
	
	
}
