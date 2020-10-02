package principal;
import componentesCurriculares.Curso;
import componentesCurriculares.EngenhariaDaComputacao;
import componentesCurriculares.ContainerDeCursos;



public class TesteClasseAbstrata {

	public static void main(String[] args) {
		
		//Curso curso1 = new Curso(); Não posso instanciar desse modo pois a classe é somente um modelo
		
//		EngenhariaDaComputacao egc = new EngenhariaDaComputacao();
		
		ContainerDeCursos containerDeCursos = new ContainerDeCursos();
		containerDeCursos.escreveObjetosNaTela();
		
	}

}
