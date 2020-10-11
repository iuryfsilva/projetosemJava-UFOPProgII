package exercicio07;

import ExcecoesTP07.ContaExcecao;

public class Conta {

	private double saldo, limite;
	
	public double getSaldo() {
		return this.saldo;
	}
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return this.limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	// Métodos Personalizados
	public void deposita(double valorDeposito) {
		this.setSaldo(valorDeposito);
	}
		
	public void saca(double valorSacado) throws ContaExcecao{
		if(this.getSaldo() < valorSacado) {
			ContaExcecao excecaoSaqueIndisponivel = new ContaExcecao("ERRO: O valor desejado excede o saldo disponível.");
			throw  excecaoSaqueIndisponivel;
		}if(this.getSaldo() >= this.getLimite() && this.getLimite() >= valorSacado)
			this.setSaldo(this.getSaldo() - valorSacado);
	}
	
}
