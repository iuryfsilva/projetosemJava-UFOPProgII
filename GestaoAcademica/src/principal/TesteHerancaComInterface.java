package principal;
import pessoas.IntefacePessoa;
import pessoas.Aluno;
import pessoas.Monitor;
import pessoas.Pessoa;
import pessoas.Professor;

public class TesteHerancaComInterface {

	public static void main(String[] args) {
		
		IntefacePessoa vetorInterface[] = new IntefacePessoa[3];
		
		vetorInterface[0] = new Professor("12313215", "Doutor");
		vetorInterface[1] = new Aluno("2018.2.8171", "BIOLOGIA", "Jao da SILVA", "123321222232");
		vetorInterface[2] = new Monitor("5421.1.8955", "Letras", "Ze paulo", "123321222232");
		
		for(int controle = 0; controle < vetorInterface.length; controle++) {
			System.out.println(vetorInterface[controle].getCpf());
			System.out.println(vetorInterface[controle].getNome());
		}
		
		Pessoa pessoa = new Professor("7894565", "Mestre");
		pessoa.escrveObjetoNaTela();
	}

}
