package Objetos;

import javax.swing.ImageIcon;

public abstract class GameObject {

	
	protected Punto posicion;
	protected ImageIcon imagen;
	
	public Punto getPosicion(){
		return posicion;
	}
	
	public ImageIcon getImagen(){
		return imagen;
	}
	
	public abstract void colisionar();
	
	
}