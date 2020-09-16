package principal;
import componentes.Medico;
import componentes.Paciente;
import java.util.ArrayList;

import associacao.Consulta;

public class controlador {

	public static void main(String[] args) {

		//Médicos
		Medico eduardoM = new Medico("Eduardo", "Clinico Geral");
		Medico aliceM = new Medico("Alice", "Pediatria");
		Medico mariaM = new Medico("Maria", "Dermatologia");
		
		//Pacientes
		Paciente iuryP = new Paciente("Iury Silva", "123456789", 1);
		Paciente larissaP = new Paciente("Larissa Santos", "987456321", 2);
		Paciente lauraP = new Paciente("Laura Paiva", "147852963", 3);
		Paciente joseP = new Paciente("Jose Ricardo", "123456987", 4);
		Paciente jaoP = new Paciente("Jão Silva", "369258147", 5);

		//consultas
		ArrayList<Consulta> consultas = new ArrayList<>();
		Consulta consulta1 = new Consulta(11, 10, 2020, 15, 30, aliceM, iuryP);
		Consulta consulta2 = new Consulta(11, 10, 2020, 14, 30, mariaM, larissaP);
		Consulta consulta3 = new Consulta(11, 10, 2020, 16, 59, aliceM, lauraP);
		Consulta consulta4 = new Consulta(11, 10, 2020, 13, 30, mariaM, joseP);
		Consulta consulta5 = new Consulta(12, 12, 2020, 12, 45, aliceM, jaoP);
		Consulta consulta6 = new Consulta(12, 12, 2020, 11, 00, eduardoM, jaoP);
		
		consultas.add(consulta1);
		consultas.add(consulta2);
		consultas.add(consulta3);
		consultas.add(consulta4);
		consultas.add(consulta5);
		consultas.add(consulta6);
		
		// Realizando as consultas
		for(int controle = 0; controle < consultas.size(); controle++) {
			Consulta corrente = consultas.get(controle);
			corrente.realizarConsulta();
		}
		
		// Exibindo o histórico de consultas
		for(int controle = 0; controle < consultas.size(); controle++) {
			Consulta corrente = consultas.get(controle);
			corrente.exibe();
		}
		
		
	}

}
