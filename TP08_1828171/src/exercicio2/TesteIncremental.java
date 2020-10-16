package exercicio2;

public class TesteIncremental {

	public static void main(String[] args) {

		for(int i = 0; i < 10; i++) {
			Incremental inc = Incremental.GetIncremental();//foinecessaria a alteração nessa linha para chamar o metodo
			System.out.println(inc);
 		}
		
	}

}
