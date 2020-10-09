package exercicio03;

public class Funcionario implements Comparable<Funcionario>{
	private static int contadorEmpregados = 0;
	private String nome, dataContratacao, ID;
	private double salario;
	
	//Métodos Especiais
	public Funcionario(String ID, String nome, String data) {
		this.setID(ID);
		this.setNome(nome);
		this.setDataContratacao(data);
	}	
	public Funcionario(String ID, String nome, int dia, int mes,int ano) {
		this.setID(ID);
		this.setNome(nome);
		this.setDataContratacao(dia, mes, ano);		
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
	
	public String getDataContratacao() {
		return this.dataContratacao;
	}
	public void setDataContratacao(int dia, int mes, int ano) {
		this.dataContratacao = Integer.toString(dia) + Integer.toString(mes) + Integer.toString(ano);
	}
	public void setDataContratacao(String dataContratacao) {
		this.dataContratacao = dataContratacao;
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
		string += " \nData contratacao: " + this.getDataContratacao();
		string += " \nSalário: " + this.getSalario();
		return string;
	}
	
	@Override
	public int compareTo(Funcionario funcionario) {
		if(this.getNome().charAt(0) < funcionario.getNome().charAt(0))
			return -1;
		else if(this.getNome().charAt(0) > funcionario.getNome().charAt(0))
			return 1;
		else
			return 0;
	}
	
}
