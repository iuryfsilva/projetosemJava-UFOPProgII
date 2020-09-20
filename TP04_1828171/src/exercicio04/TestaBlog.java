package exercicio04;

import java.util.Scanner;
 

public class TestaBlog {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);		

		Blog blog1 = new Blog();
		
		// Usuarios autenticados fazem parte dessa lista
		Usuario listaUsuariosAutenticados[] = new Usuario[2];
		listaUsuariosAutenticados[0] = new Usuario(0, "Iury Silva", "iury.silva", "abc123");
		listaUsuariosAutenticados[1] = new Usuario(1, "Jardel Felipe", "jardef.123", "cba321");
		
		// Cria e adiciona postagem ao blog
		Postagem postagem0 = new Postagem(listaUsuariosAutenticados, listaUsuariosAutenticados[0]);
		blog1.adicionarPostagem(postagem0);

		// Cria e adiciona postagem ao blog
		Postagem postagem1 = new Postagem(listaUsuariosAutenticados, listaUsuariosAutenticados[1]);
		blog1.adicionarPostagem(postagem1);
		
		System.out.println("Publicando postagem...");
		blog1.publicarPostagem(postagem1);
		System.out.println("Data publicação: " + postagem1.getDataPublicacao().toString());
		
		// Cria e adiciona postagem ao blog
		Postagem postagem2 = new Postagem(listaUsuariosAutenticados, listaUsuariosAutenticados[1]);
		blog1.adicionarPostagem(postagem2);
		
		System.out.println("Publicando postagem...");
		blog1.publicarPostagem(postagem2);
		System.out.println("Data publicação: " + postagem2.getDataPublicacao().toString());
		
		blog1.listarPostagemPublicadas();
		blog1.listarTodasAsPostagens();
		blog1.apagarPostagem(postagem2);
		System.out.println("Postagem2 apagada ");
		System.out.println();
		
		blog1.listarPostagemPublicadas();
		blog1.listarTodasAsPostagens();
		
		// Testa postagem usuario não autenticado
		Usuario jao = new Usuario(2, "Jão", "jao123", "123456");
		
		Postagem postagemjao = new Postagem(listaUsuariosAutenticados, jao);
		if(postagemjao.autenticaUsuario(listaUsuariosAutenticados, jao))
			System.out.println("A postagem acima não pode ser adicionada ao blog pois o usuario não é autenticado");
		
		
	
		teclado.close();
	}

}
