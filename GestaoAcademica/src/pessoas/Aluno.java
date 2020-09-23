package pessoas;
import componentesCurriculares.Disciplina;

public class Aluno extends Pessoa{
	
	private static int contadorDeAluno = 0;//vari�vel da classe, n�o � da instancia
	private String matricula, curso;
	private String listaDeDisciplinas[] = new String[10];
	private int indiceDisciplina;
	
	private Disciplina disciplina;

	//M�todos Especiais
	public Aluno(String matricula, String curso, String nome, String cpf) {
		
		super(cpf);
		super.setNome(nome);
		contadorDeAluno++;
		this.setMatricula(matricula);
		this.setCurso(curso);
		//System.out.println("Total de alunos criados: " + Aluno.contadorDeAluno);
	}
	
 	public String getMatricula() {
		return this.matricula;
	}
	public void setMatricula(String matricula) {
		if(this.validaMatricula(matricula))
			this.matricula = matricula;
		else
			System.out.println("Matricula Inv�lida!");
	}

	public String getCurso() {
		return this.curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public Disciplina getDisciplina() {
		return this.disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		if(this.disciplina != null)
			System.out.println("Disciplina ja definida! ");
		else
			this.disciplina = disciplina;
	}
	
	//M�todos Personalizados
	public boolean validaMatricula(String matricula) {
		if(matricula == "" || matricula == null)
			return false;
		
		String variavelAuxiliar[] = matricula.split("\\.");
		if(variavelAuxiliar.length != 3)
			return false;
		
		if(Integer.parseInt(variavelAuxiliar[0]) < 2000 || Integer.parseInt(variavelAuxiliar[0]) > 2020)
			return false;

		return true;
	}
	
	public void matricular(String disciplina) {
		//System.out.println("Esta matriculado em CEA965?");
		if(this.estaMatriculadoNaDisciplina(disciplina)) {
			System.out.println("J� existe a matricula em " + disciplina);
			return;//n�o execulta o restante do m�todo caso seja verdadeira
		}
		if(this.indiceDisciplina < 10) {
			this.listaDeDisciplinas[this.indiceDisciplina] = disciplina;
			this.indiceDisciplina++;
		}else System.out.println("O aluno " + this.getNome() + " j� esta matriculado em 10 disciplinas! "); 
		
	}
	
	public boolean 	estaMatriculadoNaDisciplina(String disciplina) {
		for(int controle = 0; controle < this.indiceDisciplina; controle++) {
			if(this.listaDeDisciplinas[controle].equals(disciplina))
				return true;
		}
		return false;
	}
	
	public String[] obterDisciplinasCursadas() {
		String disciplinas[] = new String[this.indiceDisciplina];
		for(int controle = 0; controle < disciplinas.length; controle++) {
			disciplinas[controle] = this.listaDeDisciplinas[controle];
		}
		return disciplinas;
	}

	public void mostraListaDisciplina() {
		for(int controle = 0; controle < this.indiceDisciplina; controle++) {
			System.out.println(this.listaDeDisciplinas[controle]);
		}
	}

	public static int getContadorDeAluno() {
		return contadorDeAluno;
	}

}
