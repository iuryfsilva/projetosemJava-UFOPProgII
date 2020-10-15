package br.ufop.tomada;

public class AdaptadorDeTomadaDoisPinos extends TomadaDoisPinos{

	private TomadaDeTresPinos objetoTomadaDeTresPinos;
	
	public AdaptadorDeTomadaDoisPinos(TomadaDeTresPinos tomadaDetresPinos) {
		this.objetoTomadaDeTresPinos = tomadaDetresPinos;
	}
	
	@Override
	public void ligarNaTomadaDeDoisPinos() {
		this.objetoTomadaDeTresPinos.ligarNaTomadaDeTresPinos();
	}
	
}
