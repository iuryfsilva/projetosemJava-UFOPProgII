package exercicio03;

public class Restaurante extends Empresa{

	private String tipoComida;
	private float valorPrato;
	
	public Restaurante(String nome, String endereco,String cidade,
			   		   String estado, int telefone, int cep){
		super(nome, endereco, cidade, estado, telefone, cep); 
		
		super.setNome(super.getNome());
		
		this.printRestaurante();
	}
	
	public String getTipoComida() {
		return this.tipoComida;
	}
	public void setTipoComida(String tipoComida) {
		this.tipoComida = tipoComida;
	}
	
	public float getValorPrato() {
		return this.valorPrato;
	}
	public void setValorPrato(float valorPrato) {
		this.valorPrato = valorPrato;
	}
	
	public void printRestaurante() {
		super.printNome();
		System.out.println("Tipo de comida: " + this.getTipoComida());
		System.out.println("Valor prato: " + this.getValorPrato());
	}
}
