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
	
	@Override
	public void escrveObjetoNaTela() {
		System.out.println("--------------------------------");
		System.out.println("------------MONITOR-------------");
		System.out.println("--------------------------------");
		super.escrveObjetoNaTela();
		System.out.println("Disciplina monitorada: " + this.getDisciplinaMonitorada().getNome());
	}


}
