package componentesCurriculares;

public class EngenhariaDaComputacao extends Curso{
	
	public String getNome() {
		return "Engenharia Da Computa��o";
	}

	@Override
	public void escreveNaTela() {
		System.out.println(this.getNome());		
	}

}
