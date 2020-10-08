package principal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TestaSet {

	public static void main(String[] args) {
		
		Set<String> palavras = new HashSet<String>();
		
		palavras.add("Jão");
		palavras.add("Paulo");
		palavras.add("Ze");
		palavras.add("Ze");
		
		System.out.println(palavras);
		
		for (String palavraCorrente : palavras) {
			System.out.println(palavraCorrente);
		}
		
	}

}
