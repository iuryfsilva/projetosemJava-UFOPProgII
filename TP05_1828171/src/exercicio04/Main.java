package exercicio04;

public class Main {

	public static void main(String[] args) {

		Cachorro poppy = new Cachorro();
		poppy.setNome("Poppy");
		poppy.setRaca("Doberman");
		System.out.println("Nome:" + poppy.getNome());
		System.out.println("Raça:" + poppy.getRaca());
		System.out.println("Estado:" + poppy.late());
		System.out.println("Estado:" + poppy.caminha());
		
		
		Gato sakamoto = new Gato();
		sakamoto.setNome(" Sakamoto san");
		sakamoto.setRaca(" Kusou Cat");
		System.out.println("Nome:" + sakamoto.getNome());
		System.out.println("Raça:" + sakamoto.getRaca());
		System.out.println("Estado:" + sakamoto.mia());
		System.out.println("Estado:" + sakamoto.caminha());
		
		
	}

}
