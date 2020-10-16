package bancoDeDados;

public class Conexao {
	
	private static Conexao instancia;
	private static int ContadorInstancia = 0;

	private String usuario, senha;

	private Conexao() {

	}
	
	public static Conexao GetInstance() {
		if(instancia == null) 
			instancia = new Conexao();
			ContadorInstancia++;
		return  instancia;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	public String toString() {
		return "Usuario: " + this.usuario + "\nSenha: " + this.senha;
	}
	
	public static int GetContadorDeInstancias() {
		return ContadorInstancia;
	}
	
}
