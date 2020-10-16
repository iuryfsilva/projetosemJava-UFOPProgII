package exercicio1;

public class UnicaInstancia {
	
	private static final UnicaInstancia instancia = new UnicaInstancia();
	private static int ContadorInstancia = 0;
	private int contador;
	
	//Construtor que faz com que o singleton somente seja instanciado dentro da classe
	private UnicaInstancia() {
		contador = ++ContadorInstancia;
	}
	
	public static UnicaInstancia GetUnicaInstancia() {
		return instancia;
	}

	@Override
	public String toString() {
		return "Contador de instancias: " + this.contador;
	}


}
