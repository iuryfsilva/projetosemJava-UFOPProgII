package componentesCurriculares;

public class EngenhariaDaComputacao extends Curso{
	
	public String getNome() {
		return "Engenharia Da Computa��o";
	}

	@Override
	public void escreveNaTela() {
		System.out.println("Nome do curso: " + this.getNome());	
		System.out.println("Dura��o: "+ this.getDuracao());
	}

}
