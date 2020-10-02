package componentesCurriculares;

public class EngenhariaDaComputacao extends Curso{
	
	public String getNome() {
		return "Engenharia Da Computação";
	}

	@Override
	public void escreveNaTela() {
		System.out.println(this.getNome());		
	}

}
