package exercicio07;

import ExcecoesTP07.ContaExcecao;

public class CaixaComSaldoMesmoComException {

	public static void main(String[] args) {
		Conta minhaConta  = new Conta();
		try {
			minhaConta.deposita(100);
			minhaConta.setLimite(100);
			minhaConta.saca(1000);
		} catch (ContaExcecao excecaoSaqueIndisponivel) {
			System.err.println(excecaoSaqueIndisponivel.getMessage());
	// basta a adição desse bloco finally para que seja apresentado o saldo mesmo com a exceçap
		}finally {
			System.out.println("Saldo atual: " + minhaConta.getSaldo());
		}
				
	}

}
