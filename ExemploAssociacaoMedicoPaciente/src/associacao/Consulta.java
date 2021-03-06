package associacao;
import componentes.Medico;
import componentes.Paciente;
import java.util.Random;

public class Consulta {

	private int dia, mes, ano;
	private int hora, minuto;
	private Medico medico;
	private Paciente paciente;
	private String receitaMedica;
	
	public Consulta(int dia, int mes, int ano, int hora, int minuto, Medico medico, Paciente paciente) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.hora = hora;
		this.minuto = minuto;
		this.medico = medico;
		this.paciente = paciente;
	}

	//remedios completamente aleatorios
	public void realizarConsulta() {
		String remedios[] = {"Fluconazol", "Dipirona", "Neosaldina", "Benegripe"};
		Random aleatorio = new Random();
		this.receitaMedica = remedios[aleatorio.nextInt(4)];
	}

	public void exibe() {
		System.out.println("Data: " + this.dia + "/" + this.mes + "/" + this.ano);
		System.out.println("Hora: " + this.hora + ":" + this.minuto);
		System.out.println("Medico: " + this.medico.getNome() + " | Especialidade: " + this.medico.getEspecialidade());
		System.out.println("Paciente: " + this.paciente.getNome());
		System.out.println("Receita: " + this.receitaMedica);
		System.out.println();

	}
	
}
