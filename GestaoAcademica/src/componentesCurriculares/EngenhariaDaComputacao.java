package componentesCurriculares;

public class EngenhariaDaComputacao extends Curso{
	
	public String getNome() {
		return "Engenharia Da Computação";
	}

	@Override
	public void escreveNaTela() {
		System.out.println("Nome do curso: " + this.getNome());	
		System.out.println("Duração: "+ this.getDuracao());
	}

}
