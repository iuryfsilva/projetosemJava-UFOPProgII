package componentesCurriculares;

public abstract class Curso implements Comparable<Curso>{

	private String modalidade, turno, campus;
	private int duracao, numeroDeVagas;
	
	// Métodos Especiais
	public abstract String getNome();

	public String getModalidade() {
		return this.modalidade;
	}
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	
	public String getTurno() {
		return this.turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	public String getCampus() {
		return this.campus;
	}
	public void setCampus(String campus) {
		this.campus = campus;
	}
	
	public int getDuracao() {
		return this.duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	public int getNumeroDeVagas() {
		return this.numeroDeVagas;
	}
	public void setNumeroDeVagas(int numeroDeVagas) {
		this.numeroDeVagas = numeroDeVagas;
	}
	
	public abstract void escreveNaTela();
	
	@Override
	public int compareTo(Curso o) {
		if(this.getDuracao() < o.getDuracao())
			return -1;
		else if(this.getDuracao() > o.getDuracao())
			return 1;
		else
			return 0;
	}
}
