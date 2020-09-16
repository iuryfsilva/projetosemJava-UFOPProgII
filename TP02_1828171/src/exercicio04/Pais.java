package exercicio04;
import java.util.Scanner;

public class Pais {

	private String codigoIsso31661, nomePais;
	private String paisesLimitrofes[] = new String[3];
	private long populacao;
	private double dimensaoKm2;
	
	//Métodos Especiais
	public String getCodigoIsso31661() {
		return this.codigoIsso31661;
	}
	public void setCodigoIsso31661(String codigoIsso31661) {
		this.codigoIsso31661 = codigoIsso31661;
	}
	
	public String getNomePais() {
		return this.nomePais;
	}
	public void setNomePais(String nomePais) {
		this.nomePais = nomePais;
	}
	
	public String[] getPaisesLimitrofes() {
		return this.paisesLimitrofes;
	}
	public void setPaisesLimitrofes(String paisesDaFronteira[]) {
		for(int controle = 0; controle < this.paisesLimitrofes.length; controle++) {
			this.paisesLimitrofes[controle] = paisesDaFronteira[controle];
		}
	}
	
	public long getPopulacao() {
		return this.populacao;
	}
	public void setPopulacao(long populacao) {
		if(populacao <= 0) 
			System.out.println("Quantidade de pessoas invalida!");
		else	
			this.populacao = populacao;
	}
	
	public double getDimensaoKm2() {
		return this.dimensaoKm2;
	}
	public void setDimensaoKm2(double dimensaoKm2) {
		if(dimensaoKm2 <= 0) 
			System.out.println("Dimensão do território invalida!");
		else	
			this.dimensaoKm2 = dimensaoKm2;
	}
	
	
	//Métodos Personalizados
	public void execultaPais() {
		Scanner teclado = new Scanner(System.in);
		String paisesDaFronteira[] = new String[3];
		
		System.out.println("Codigo ISSO 3166-1 do país: ");
		this.setCodigoIsso31661(teclado.nextLine());
		System.out.println("Nome do país: ");
		this.setNomePais(teclado.nextLine());
		System.out.println("População: ");
		this.setPopulacao(teclado.nextLong());
		System.out.println("Dimensão do país em Km^2: ");
		this.setDimensaoKm2(teclado.nextDouble());
		
		System.out.println("Informe os paises que fazem fronteira: ");
		for(int controle = 0; controle < paisesDaFronteira.length; controle++) {
			System.out.println("País: ");
			paisesDaFronteira[controle] = teclado.next();
		}
		this.setPaisesLimitrofes(paisesDaFronteira);
		
		System.out.printf("\nA densidade populacional: %.2f  pessoas/Km^2\n\n", this.densidadePopulacional());
		
		System.out.println("Informe o pais para verificar se este é limítrofe: ");
		String verificarPais = teclado.next();
		System.out.println("Resultado Verificação: " + this.verificaPaisLimitrofe(verificarPais) + "\n");
		
		imprimeTodosOsVizinhos();
		
		teclado.close();
	}
	
	public boolean verificaPaisLimitrofe(String verificarPais) {
		for(int controle = 0; controle < this.paisesLimitrofes.length; controle++) {
			if(this.paisesLimitrofes[controle].equalsIgnoreCase(verificarPais)) {
				return true;
			}
		}
		return false;
	}
	
	public double densidadePopulacional() {
		double densidadePopulacional = 0.00;
		if((this.getDimensaoKm2()) != 0)
			densidadePopulacional = this.getPopulacao() / this.getDimensaoKm2();
		return densidadePopulacional;
	}
	
	public void imprimeTodosOsVizinhos() {
		System.out.println("Paises vizinhos: ");
		for(int controle = 0; controle < this.paisesLimitrofes.length; controle++){
			if(controle == this.paisesLimitrofes.length)
				System.out.print(this.getPaisesLimitrofes()[controle] + ". ");
			else
				System.out.print(this.getPaisesLimitrofes()[controle] + ", ");
		}
	}
	
}
