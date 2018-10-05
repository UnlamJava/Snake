package juego;

public class objetoDelMapa {
	
	private int id;
	private Posicion posicion;
	public objetoDelMapa(int posicionX, int posicionY, int id) {
		this.id=id;
		this.posicion=new Posicion(posicionX, posicionY);
	}
	

}
