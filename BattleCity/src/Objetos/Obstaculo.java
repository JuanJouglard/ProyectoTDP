package Objetos;

import javax.swing.ImageIcon;
import Visitores.*;

/**
 * Clase abstracta Obstaculo, extiende GameObject
 * @author Artola, Fiore, Jouglard.
 *
 */
public abstract class Obstaculo extends GameObject {
	/**
	 * Atributos de la clase Obstaculo.
	 */
	
	protected int vida;
	/**
	 * Metodo destruir: le asigna al obstaculo que recibe el mensaje la imagen de vacio.
	 */
	public void destruir(){
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/Images/vacio.png")));
		miVisitor=new VisitorObstaculoTransitable();
	}
	
	public abstract boolean recibirDisparo();
}
