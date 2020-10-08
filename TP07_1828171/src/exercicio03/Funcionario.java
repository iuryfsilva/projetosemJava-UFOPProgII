package exercicio03;

public class Funcionario {
	private static int contadorEmpregados = 0;
	private String nome, cargo, ID;
	private double salario;
	
	//Métodos Especiais
	public Funcionario(String ID, String nome) {
		this.setID(ID);
		this.setNome(nome);
	}

	public static int getContadorEmpregados() {
		return contadorEmpregados;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCargo() {
		return this.cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getID() {
		return this.ID;
	}
	public void setID(String ID) {
		this.ID = ID;
	}
		
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	// Métodos Personalizados
	@Override
	public boolean equals(Object obj) {
		Funcionario funcionario = (Funcionario)obj;
		if(this.getID().equals(funcionario.getID()))
			return true;
		else
			return false;
	}
	
	@Override
	public int hashCode() {
		return this.getID().charAt(0);
	}
	
	@Override
	public String toString() {
		String string = "ID: " + this.getID();
		string += " \nNome: " + this.getNome();
		string += " \nCargo: " + this.getCargo();
		string += " \nSalário: " + this.getSalario();
		return string;
	}
	
}
