package exercicio01;
import exercicio02.Departamento;

public class Universidade {
	
	private int contadorPessoas = 0;
	private int contadorDepartamentos = 0;
	private String nomeUniversidade;
	private String localizacao;
	private Departamento departamentos[] = new Departamento[50];// não tinha colocado o tamanho
	
	// Métodos Especiais
	public Universidade(String nomeUniversidade, String Localizacao) {
		this.setNomeUniversidade(nomeUniversidade);
		this.setLocalizacao(Localizacao);
	}
	
	public String getNomeUniversidade() {
		return this.nomeUniversidade;
	}
	public void setNomeUniversidade(String nomeUniversidade) {
		this.nomeUniversidade = nomeUniversidade;
	}
	
	public String getLocalizacao() {
		return this.localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	public int getContadorDePessoas() {
		return this.contadorPessoas;
	}
	public void setContadorDePessoas(int contadorDePessoas) {
		this.contadorPessoas = contadorDePessoas;
	}
	
	public Departamento[] getDepartamentos() {
		return this.departamentos;
	}
	public void setDepartamentos(String nomeDepartamento) {
		if(this.contadorDepartamentos < this.departamentos.length) {
			this.departamentos[this.contadorDepartamentos] = new Departamento(nomeDepartamento); 
			this.contadorDepartamentos++;
		}
	}
	
	public void addDepartamento(Departamento novoDepartamento) {
		if(this.contadorDepartamentos < this.departamentos.length) {
			this.departamentos[this.contadorDepartamentos] = novoDepartamento;
			this.departamentos[this.contadorDepartamentos].setReferenciaUniversidade(this) ;
			this.contadorDepartamentos++;
		}
	}
	
	public void imprimirDepartamentosUniversidade() {
		System.out.println("\n+++++ Lista de Departamentos da " + getNomeUniversidade() + " +++++\n");
		for(int controle = 0; controle < contadorDepartamentos; controle++) {
			System.out.println(" - " + departamentos[controle].getNomeDepartamento() + 
							   " - " + departamentos[controle].getReferenciaUniversidade().getNomeUniversidade());
		}
		System.out.println("------------------------------------------------");
	}


}
