package exercicio04;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Postagem {
	private int idPostagem = 1;
	private String titulo, texto;
	private Date dataPublicacao;
	
	public Postagem() {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o Id da postagem: ");
		this.setTitulo(teclado.next());
		System.out.println("Informe o Id da postagem: ");
		this.setTexto(teclado.next());
		
		teclado.close();
	}
	
	public int getIdPostagem() {
		return this.idPostagem;
	}
	public void setIdPostagem(int idPostagem) {
		this.idPostagem = idPostagem;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getTexto() {
		return this.texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public Date getDataPublicacao() {
		return this.dataPublicacao;
	}
	public void setDataPublicacao() {
		LocalDate dataPublicacao = LocalDate.now();
		this.dataPublicacao = dataPublicacao;
	}
	
	
}
