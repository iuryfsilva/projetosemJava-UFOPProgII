package exercicio04;

import java.util.Scanner;

public class Blog {
	private Postagem postagem[];
		
	public void adicionarPostagem(Postagem postagem) {
		int controle = postagem.getIdPostagem();
		this.postagem[controle] = postagem;
	}
	
	public void publicarPostagem(Postagem postagem) {
		
	}
	
	public void listarPostagemPublicadas(){
		
	}
	
	public void listarTodasAsPostagens() {
		
	}
	
	public void apagarPostagem(Postagem postagem) {
		
	}
	
}
