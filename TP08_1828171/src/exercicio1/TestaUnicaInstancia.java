package exercicio1;

public class TestaUnicaInstancia {

	public static void main(String[] args) {

		UnicaInstancia instancia = UnicaInstancia.GetUnicaInstancia();
		UnicaInstancia instancia2 = UnicaInstancia.GetUnicaInstancia();
		
		if(instancia == instancia2)
			System.out.println("Instancias diferentes para a mesma referencia.");
		
		System.out.println(instancia);		
	}

}
