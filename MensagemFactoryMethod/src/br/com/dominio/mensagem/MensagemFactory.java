package br.com.dominio.mensagem;

public class MensagemFactory {

	public static Mensagem getMensagem(int valor) {
		if(valor == 1)
			return new MensagemSMS();
		else
			return new MensagemEmail();
	}
	
}
