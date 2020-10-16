package exercicio2;

public class Incremental {

	private static final Incremental instance = new Incremental();
	private static int count = 0;
	private int numero;
	
	private Incremental() {
		this.numero = ++count;
	}


	public static Incremental GetIncremental() {
		return instance;
	}

	@Override
	public String toString() {
		return "Incremental " + this.numero;
	}
	
}
