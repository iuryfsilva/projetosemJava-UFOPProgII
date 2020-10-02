package exercicio04;


public class CD extends Midia{
	private int nMusicas;
	
	// Métodos Especiais
	public CD() {
		this(0, 0.00, "Vazio", 0);
	}
	public CD(int c, double p, String s, int m) {
		super(c, p, s);
		this.setMusica(m);
	}
	
	public int getnMusicas() {
		return this.nMusicas;
	}
	public void setnMusicas(int nMusicas) {
		this.nMusicas = nMusicas;
	}
	
	// Métodos Personalizados
	public void setMusica(int m) {
		this.setnMusicas(this.getnMusicas() + m);
	}
	
	@Override
 	public String getTipo() {
		return super.getTipo() + " - " + CD.class.getSimpleName();
	}

	@Override
	public String getDetalhes() {
		System.out.println("Imprimindo a Capa do DVD...");
		return super.getDetalhes() + ";\nNumero de Musicas: " + this.nMusicas;
	}

	@Override
	public void inserirDados() {
		super.inserirDados();
		System.out.println("Informe o numero de musicas: ");
		this.setMusica(super.teclado.nextInt());
	}
	
	
}
