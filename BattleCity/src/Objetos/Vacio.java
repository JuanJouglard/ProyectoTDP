package Objetos;

import java.awt.Point;

import javax.swing.ImageIcon;

public class Vacio extends Obstaculo {

	public Vacio(Point m,ImageIcon[] i){
		posicion=m;
		imagen=i;
	}
	
	@Override
	public void colisionar() {
		// TODO Auto-generated method stub

	}

}
