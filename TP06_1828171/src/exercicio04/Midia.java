package exercicio04;

import java.util.Scanner;

public class Midia implements IMidia{
 	public Scanner teclado = new Scanner(System.in);
	private int codigo;
	private double preco;
	private String nome;
	
	// Métodos Especiais
	public Midia() {
		this(0, 0.00, "vazio");
	}
	public Midia(int c, double p, String n) {
		this.setCodigo(c);
		this.setPreco(p);
		this.setNome(n);
	}

	public int getCodigo() {
		return this.codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public double getPreco() {
		return this.preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// Métodos Personalizados
	@Override
	public String getTipo() {	
		return this.getClass().getSimpleName();
	}
	@Override
	public String getDetalhes() {
		return "Codigo: " + this.getCodigo() +
			   ";\nNome: " + this.getNome() + 
			   ";\nPreço: R$ " + this.getPreco();
	}
	
	public void printDados() {
		System.out.println("--------------------------------");
		System.out.println(this.getTipo()); 
		System.out.println(this.getDetalhes());
	}
	
	public void inserirDados() {
		System.out.println("Informe o código: ");
		this.setCodigo(teclado.nextInt());
		System.out.println("Informe o nome: ");
		this.setNome(teclado.next());
		System.out.println("Informe o preço: ");
		this.setPreco(teclado.nextDouble());
	}
	
}
