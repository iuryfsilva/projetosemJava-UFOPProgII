package exercicio01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LeUmaSerieDeNomes {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Set<String> setOfNames = new HashSet<String>(); 
		int escolha = 0;
		String nome = "";
		
		boolean controle = true;
		while(controle) {
			System.out.println("Informe a opção desejada:  "
								+ "1- Inserir/ 2- Remover/ 3- Verificar Nome/"
								+ " 4- Limpar Set/ 5- Sair");
			escolha = teclado.nextInt();
						
			switch (escolha){
				case 1:
					System.out.println("Informe o nome que deseja Inserir: ");
					nome = teclado.next(); 
					if(setOfNames.contains(nome) == false)
						setOfNames.add(nome);
					continue;
				case 2: 
					System.out.println("Informe o nome que deseja Remover: ");
					nome = teclado.next(); 
					if(setOfNames.contains(nome))
						setOfNames.remove(nome);
					continue;
				case 3:
					System.out.println("Informe o nome que deseja Verificar: ");
					nome = teclado.next(); 
					if(setOfNames.contains(nome))
						System.out.println("Nome ja armazenado. ");
					else//aqui deve exibir uma mensagem de erro
						System.out.println("Nome não encontrado");
					continue;
				case 4:
					System.out.println("Todos os nomes serão removidos.");
					setOfNames.clear();
					System.out.println("Conjunto sem elementos.");
					continue;
				case 5:
					controle = false;
					break;
			}
	
		}
		
		for (String nomeCorrente: setOfNames) {
			System.out.println(nomeCorrente);
		}
		
		teclado.close();
	}

}

