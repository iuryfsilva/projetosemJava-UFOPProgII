package exercicio06;

import ExcecoesTP07.ContaExcecao;

public class Caixa {

	public static void main(String[] args) {
		Conta minhaConta  = new Conta();
		try {
			minhaConta.deposita(100);
			minhaConta.setLimite(100);
			minhaConta.saca(1000);
			System.out.println("Saldo atual: " + minhaConta.getSaldo());
		} catch (ContaExcecao excecaoSaqueIndisponivel) {
			System.err.println(excecaoSaqueIndisponivel.getMessage());
		}
				
	}

}
