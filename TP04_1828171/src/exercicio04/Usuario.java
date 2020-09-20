package exercicio04;

public class Usuario {

	private int idUsuario;
	private String nomeUsuario, login, senha;
	
	// Métodos Especiais
	public Usuario(int idUsuario, String nomeUsuario, String login, String senha) {
		this.setIdUsuario(idUsuario);
		this.setNomeUsuario(nomeUsuario);
		this.setLogin(login);
		this.setSenha(senha);
	}
	
	public int getIdUsuario() {
		return this.idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	public String getNomeUsuario() {
		return this.nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	
	public String getLogin() {
		return this.login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getSenha() {
		return this.senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
