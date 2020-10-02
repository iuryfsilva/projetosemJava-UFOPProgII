package exercicio04;


public class DVD extends Midia{
	private int nFaixas;
	
	// Métodos Especiais
	public DVD() {
		this(0, 0.00, "Vazio", 0);
	}
	public DVD(int c, double p, String s, int f) {
		super(c, p, s);
		this.setFaixas(f);
	}
	
	public int getnFaixas() {
		return this.nFaixas;
	}
	public void setnFaixas(int nFaixas) {
		this.nFaixas = nFaixas;
	}
	
	// Métodos Personalizados
	public void setFaixas(int f) {
		this.setnFaixas(this.getnFaixas() + f);
	}
	
	@Override
	public String getTipo() {
		return super.getTipo() + " - " + DVD.class.getSimpleName();
	}

	@Override
	public String getDetalhes() {
		System.out.println("Imprimindo a Capa do DVD...");
		return super.getDetalhes() + ";\nNumero de Faixas: " + this.nFaixas;
	}

	@Override
	public void inserirDados() {
		super.inserirDados();
		System.out.println("Informe o numero de faixas: ");
		this.setFaixas(super.teclado.nextInt());
	}
	

}
