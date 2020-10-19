package firma;

public class Principal {

	public static void main(String[] args) {

		Empregado employer = new Empregado("XXX", "XXX", 0.0);
		
			System.out.println("Nome: " + employer.getNome());
			System.out.println("Sobrenome: " + employer.getSobrenome());
			System.out.println("Salario mensal: " + employer.getSalarioMensal());
			System.out.println("Salario anual: " + employer.getSalarioMensal() * 12);
			
			employer.setNome("jao");
			employer.setSobrenome("Silva");
			employer.setSalarioMensal(-1.0);
				
			System.out.println("Nome: " + employer.getNome());
			System.out.println("Sobrenome: " + employer.getSobrenome());
			System.out.println("Salario mensal: " + employer.getSalarioMensal());
			System.out.println("Salario anual: " + employer.getSalarioMensal() * 12);
			
			
			employer.setSalarioMensal(employer.getSalarioMensal() + (employer.getSalarioMensal() * 10) / 100);
			
			System.out.println("Novo salario mensal: " + employer.getSalarioMensal());
			System.out.println("Novo salario anual: " + employer.getSalarioMensal() * 12);
			
			
		Empregado employer1 = new Empregado("XXX", "XXX", 0.0);
		
			System.out.println("Nome: " + employer1.getNome());
			System.out.println("Sobrenome: " + employer1.getSobrenome());
			System.out.println("Salario mensal: " + employer1.getSalarioMensal());
			System.out.println("Salario anual: " + employer1.getSalarioMensal() * 12);
			
		
			employer1.setNome("ze");
			employer1.setSobrenome("pedro");
			employer1.setSalarioMensal(500.30);
				
			System.out.println("Nome: " + employer1.getNome());
			System.out.println("Sobrenome: " + employer1.getSobrenome());
			System.out.println("Salario mensal: " + employer1.getSalarioMensal());
			System.out.println("Salario anual: " + employer1.getSalarioMensal() * 12);
			
			
			employer1.setSalarioMensal(employer1.getSalarioMensal() + (employer1.getSalarioMensal() * 10) / 100);
			
			System.out.println("Novo salario mensal: " + employer1.getSalarioMensal());
			System.out.println("Novo salario anual: " + employer1.getSalarioMensal() * 12);
			
			
	}

}
