package Objetos;

import java.awt.Point;

import javax.swing.ImageIcon;

public abstract class GameObject {

	
	protected Point posicion;
	protected ImageIcon[] imagen;
	
	
	public Point getPosicion(){
		return posicion;
	}
	
	public ImageIcon[] getImagen(){
		return imagen;
	}
	
	public abstract void colisionar();
	
	
}
