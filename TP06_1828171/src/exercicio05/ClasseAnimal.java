package exercicio05;

public class ClasseAnimal implements Animal{

	private String nomeEspecie, nomeAnimal;

	
	public ClasseAnimal(String nomeEspecie, String nomeAnimal) {
		this.setNomeEspecie(nomeEspecie);
		this.setNomeAnimal(nomeAnimal);
	}
	
	@Override

	public String getNomeEspecie() {
		return this.nomeEspecie;
	}
	public void setNomeEspecie(String nomeEspecie) {
		this.nomeEspecie = nomeEspecie;
	}
	
	@Override
	public String getNomeAnimal() {
		return this.nomeAnimal;
	}
	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}

	
}
