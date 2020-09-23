package pessoas;
import componentesCurriculares.Disciplina;


public class Monitor extends Aluno{
	private Disciplina disciplinaMonitorada;

	public Monitor(String matricula, String curso, String nome, String cpf) {
		super(matricula, curso, nome, cpf);
	}

	public Disciplina getDisciplinaMonitorada() {
		return this.disciplinaMonitorada;
	}
	public void setDisciplinaMonitorada(Disciplina disciplina) {
		this.disciplinaMonitorada = disciplina;
	}
	
}
