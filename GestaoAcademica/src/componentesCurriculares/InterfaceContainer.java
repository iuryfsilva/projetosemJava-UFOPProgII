package componentesCurriculares;

public interface InterfaceContainer {
	
	// Os métodos a seguir são abstratos por natureza
	public void insereObjetos(Object obj);
	public void devolveObjeto(int indice);
	public int obterNumeroDeObjetos();
	public void escreveObjetosNaTela();
	
}
