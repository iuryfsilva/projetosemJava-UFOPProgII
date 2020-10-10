package pessoas;

public class MonitorException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	private String  mensagem;
	
	public MonitorException(String msg) {
		this.mensagem = msg;
	}
	
	public String getMensagem() {
		return this.mensagem;
	}
	
}
