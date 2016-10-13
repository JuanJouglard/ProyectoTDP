package Objetos;

import Visitores.*;

/**
 * Clase Estrella, extiende PowerUp.
 * Modela un tipo de PowerUp llamado Estrella.
 * @author Artola, Fiore, Jouglard.
 *
 */
public class Estrella extends PowerUp {

	public Estrella(){
		miVisitor=new VisitorEstrella();
	}

	@Override
	public boolean colisionar(Visitor visitor) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
