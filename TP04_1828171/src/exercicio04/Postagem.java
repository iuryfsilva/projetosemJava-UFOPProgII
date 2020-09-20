package exercicio04;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Postagem {
	private int idUsuario;
	private String titulo, texto;
	private LocalDateTime dataPublicacao;
	private Scanner teclado = new Scanner(System.in);
	
	// Métodos Especiais
	public Postagem(Usuario listaUsuarios[], Usuario usuarioInformado) {
		if(this.autenticaUsuario(listaUsuarios, usuarioInformado)) 
			this.criaPostagem(usuarioInformado.getIdUsuario());
		else
			System.out.println("Usuário não cadastrado!");
	}
	
	public int getIdUsuario() {
		return this.idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
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
	
	public LocalDateTime getDataPublicacao() {
		return this.dataPublicacao;
	}
	public void setDataPublicacao() {
		this.dataPublicacao = LocalDateTime.now();
	}
	public void setDataPublicacao(LocalDateTime data) {
		this.dataPublicacao = data;
	}
	
	// Métodos Personalizados
	public boolean autenticaUsuario(Usuario listaUsuarios[], Usuario usuarioInformado) {
		for(int controle = 0; controle < listaUsuarios.length; controle++) {
			if(listaUsuarios[controle].equals(usuarioInformado)) 
				return true;				
		}
		return false;
	}

	private void criaPostagem(int idUsuario) {

		this.setIdUsuario(idUsuario);
		System.out.println("Informe o titulo da postagem: ");
		this.setTitulo(teclado.next());
		System.out.println("Digite o texto: ");
		this.setTexto(teclado.next());
		

	}
	
	public void imprimePostagem() {
		System.out.println("Id Usuario: " + this.getIdUsuario());
		System.out.println("Titulo da postagem: " + this.getTitulo());
		System.out.println("Postagem: \n" + this.getTexto());
		if(this.getDataPublicacao() == null) 
			System.out.println("Não publicada");
		else
			System.out.println("Data da Publicação: " + this.getDataPublicacao());
	}

}
