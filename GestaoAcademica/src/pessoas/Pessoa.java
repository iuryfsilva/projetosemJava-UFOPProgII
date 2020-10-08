package pessoas;

public abstract class Pessoa implements IntefacePessoa{

	//private final String naturalidade = "BRASILEIRO";
	private String cpf, nome, endereco;
	private int idade;

 	public Pessoa(String cpf) {
		//System.out.println("Chamei o que recebe apenas o cpf");
		this.validaParametros();
		this.cpf = cpf;
	}
	
	public Pessoa(String cpf, String nome) {
		this(cpf); //chama o construtor acima para atribuir o cpf
		//System.out.println("Chamei o que recebe o cpf e o nome");
		this.setNome(nome);
	}
	
	public Pessoa(int cpf, String nome) {
		this(String.valueOf(cpf), nome);// chama o construtor acimaque recebe o cpf e o nome 
		//System.out.println("Chamei o que recebe o inteiro cpf e o nome");
	}
	
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		// TODO Auto-generated method stub
		return this.idade;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return this.endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	private void validaParametros() {
		System.out.println("Validando info da pessoa");
	}

	public void escrveObjetoNaTela() {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		String string = "Cpf: " + this.getCpf();
		string += " Nome: " + this.getNome();
		string += " Endereço: " + this.getEndereco();		
		return string;
	}
	
	@Override
	public int hashCode() {
		return this.getCpf().charAt(0);
	}
	
	@Override
	public boolean equals(Object obj) {
		Pessoa p = (Pessoa)obj;
		if(this.getCpf().equals(p.getCpf()))
			return true;
		else
			return false;
	}

}
