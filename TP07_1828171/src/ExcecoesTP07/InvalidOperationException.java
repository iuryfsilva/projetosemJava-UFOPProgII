package ExcecoesTP07;

public class InvalidOperationException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InvalidOperationException(String msgErro){
		super(msgErro);
	}
	
}
