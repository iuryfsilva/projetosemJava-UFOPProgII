package pessoas;

public class MonitorException extends RuntimeException{

	private String  mensagem;
	
	public MonitorException(String msg) {
		this.mensagem = msg;
	}
	
	public String getMensagem() {
		return this.mensagem;
	}
	
}
