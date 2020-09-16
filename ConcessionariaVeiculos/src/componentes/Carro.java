package componentes;

public class Carro implements InterfaceCarro {
	private String modelo, placa, cor, marca;
	private float cilindrada, valor;
	private boolean vendido;
	private int unidadesEmEstoque;
	
	//Métodos Especiais
	public Carro(String modelo, String cor,
				 String placa, float cilindrada, float valor){
		
		this.setModelo(modelo);
		this.setMarca("Fiat");
		this.setCor(cor);
		this.setPlaca(placa);
		this.setCilindrada(cilindrada);
		this.setValor(valor);
		this.setVendido(false);
	}
	
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getMarca() {
		return this.marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return this.cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getPlaca() {
		return this.placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa; 
	}

	public float getCilindrada() {
		return this.cilindrada;
	}
	public void setCilindrada(float cilindrada) {
		this.cilindrada = cilindrada;
	}

	public float getValor() {
		return this.valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}

	public boolean isVendido() {
		return this.vendido;
	}
	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}

	public int getQuantidadeEmEstoque() {
		return this.unidadesEmEstoque;
	}
	public void setQuantidadeEmEstoque(int unidadesEmEstoque) {
		this.unidadesEmEstoque = unidadesEmEstoque;
	}
	
	//Métodos Personalizados
	@Override
	public void aumentaValor(float aumento) {
		if(aumento > 0) {
			this.setValor(this.getValor() + aumento);
			System.out.println("Valor: " + this.getValor());
		}
		else System.out.println("Não pode aumentar.");
	}
	@Override
	public void diminuiValor(float reducao) {
		if((this.getValor() > 0) && (reducao < this.getValor())) {
			this.setValor(this.getValor() - reducao);
			System.out.println("Valor: " + this.getValor());
		}else System.out.println("Não pode reduzir.");
	}

	@Override
	public void mudarPlaca(String novaPlaca) {
		this.setPlaca(novaPlaca);
		
	}

	@Override
	public void mudarcor(String novaCor) {
		this.setCor(novaCor);
		
	}

	@Override
	public void dadosCarro() {
		System.out.println("============" +this.getMarca()+ "==============");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Placa: " + this.getPlaca());
		System.out.println("Cor: " + this.getCor());
		System.out.println("Cilindrada: " + this.getCilindrada());
		System.out.println("Valor: " + this.getValor());
		System.out.println("Vendido: " + this.isVendido());
		System.out.println("==========================");
	}
	@Override
	public void consultaRapida() {
		// TODO Auto-generated method stub
		System.out.println("============" +this.getModelo()+ "==============");
		System.out.println("Cor: " + this.getCor());
		System.out.println("Cilindrada: " + this.getCilindrada());
		System.out.println("Valor: " + this.getValor());
		System.out.println("==========================");
	}

	@Override
	public void venderCarro() {
		this.setVendido(true);
		
	}

	@Override
	public void adicionarAoEstoque() {
		this.setQuantidadeEmEstoque(this.getQuantidadeEmEstoque() + 1);
	}
	@Override
	public void baixarDoEstoque() {
		if(this.getQuantidadeEmEstoque() > 0)this.setQuantidadeEmEstoque(this.getQuantidadeEmEstoque() - 1);
	}
	
	
}
