package exercicio08;

public class ExcecaoDoUsuario extends Exception {
	
	private static final long serialVersionUID = 1L;

	public ExcecaoDoUsuario(String msgErro){
		super(msgErro);
	}
	
}
