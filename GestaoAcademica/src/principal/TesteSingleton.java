package principal;

import bancoDeDados.Conexao;
import exercicio1.UnicaInstancia;


public class TesteSingleton {

	public static void main(String[] args) {

		Conexao com = Conexao.GetInstance();
		com.setUsuario("Iury");
		com.setSenha("1234");
		
		System.out.println(com.toString());
		
		Conexao com2 = Conexao.GetInstance();
		
		if(com == com2)
			System.out.println("Iguais");
		
		System.out.println("Quantidade de instancias criadas: " + Conexao.GetContadorDeInstancias());
		
	}

}
