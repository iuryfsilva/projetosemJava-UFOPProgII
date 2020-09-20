package exercicio04;

import java.time.LocalDateTime;


public class Blog {
	private Postagem listaPostagem[];
	private int contadorPostagem;

	// Métodos Especiais
	public Blog() {
		this.contadorPostagem = 0;
		this.listaPostagem = new Postagem[99999];

	}

	// Métodos Personalizados
	public void adicionarPostagem(Postagem postagem) {
		int index = this.contadorPostagem;
		this.listaPostagem[index] = postagem;
		this.contadorPostagem++;	
	}

	public void publicarPostagem(Postagem postagem) {
		postagem.setDataPublicacao();
	}

	public void listarPostagemPublicadas(){
		
		// Para testes pode alterar o dataAgora "LocalDateTime.now();"  para  "LocalDateTime.of(2020,12, 25, 13, 45);"
		LocalDateTime dataAgora = LocalDateTime.of(2020,12, 25, 13, 45);
		System.out.println("____Lista de postagens publicadas____\n");
		for(int controle = 0; controle < this.contadorPostagem; controle++) {
			if(this.listaPostagem[controle].getDataPublicacao() != null &&
			   this.listaPostagem[controle].getDataPublicacao().isBefore(dataAgora)) {			
				
				this.listaPostagem[controle].imprimePostagem();
				System.out.println("************************************");
			}
		}
		System.out.println("\n_____________________________________");
	}

	public void listarTodasAsPostagens() {
		System.out.println("====Lista de todas as postagens====\n");
		for(int controle = 0; controle < this.contadorPostagem; controle++) {		
			//if(this.listaPostagem[controle] != null) {
				this.listaPostagem[controle].imprimePostagem();
				System.out.println("-----------------------------------");
			//}	
		}
		System.out.println("\n===================================");
	}

	public void apagarPostagem(Postagem postagem) {
		for(int controle = 0; controle < this.contadorPostagem; controle++) {	
			if(this.listaPostagem[controle].equals(postagem)) {
				this.listaPostagem[controle].setDataPublicacao(null);
				this.listaPostagem[controle].setTitulo("Postagem Apagada");
				this.listaPostagem[controle].setTexto(null);
				break;
			}
		}
	}
				
	
}