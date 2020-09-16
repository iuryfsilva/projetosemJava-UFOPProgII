package componentesCurriculares;

public class Disciplina {
	
	private String nome, ementa, bibliografia;
	private int cargaHoraria;
	
	//M�todos Especiais
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		if(this.nome != null)
			System.out.println("N�o pode alterar o nome da disciplina!");
		else
			this.nome = nome;
	}
	
	public String getEmenta() {
		return this.ementa;
	}
	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}
	
	public String getBibliografia() {
		return this.bibliografia;
	}
	public void setBibliografia(String bibliografia) {
		this.bibliografia = bibliografia;
	}
	
	public int getCargaHoraria() {
		return this.cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	//M�todos Personalizados
	
}
