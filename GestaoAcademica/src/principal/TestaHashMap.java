package principal;

import java.util.HashMap;
import java.util.Map;

import pessoas.Pessoa;
import pessoas.Professor;

public class TestaHashMap {

	public static void main(String[] args) {

		Map<String, Pessoa> map = new HashMap<String, Pessoa>();
		
		Pessoa pessoa1 = new Professor("000", "Doutor");
		Pessoa pessoa2 = new Professor("111", "Mestre");
		
		map.put(pessoa1.getCpf(), pessoa1);
		map.put(pessoa2.getCpf(), pessoa2);
		
		System.out.println(map.size());
		System.out.println(map.containsKey("333"));
		
		Pessoa nova = map.get("000");
		
		if(pessoa1.equals(nova))
				System.out.println("São iguais! ");
		
		System.out.println(nova.getCpf());
		
	}

}
