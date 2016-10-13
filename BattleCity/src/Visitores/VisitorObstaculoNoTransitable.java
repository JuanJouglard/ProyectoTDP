package Visitores;

import Objetos.Enemigo;
import Objetos.Jugador;
import Objetos.Obstaculo;
import Objetos.Tanque;

public class VisitorObstaculoNoTransitable extends Visitor {

	@Override
	public boolean VisitarTanque(Tanque t) {
		return false;
		}

	@Override
	public boolean VisitarObstaculo(Obstaculo o) {
		return false;

	}

	@Override
	public boolean visitarJugador(Jugador j) {
		return false;
	}

	@Override
	public boolean visitarEnemigo(Enemigo e) {
		return false;

	}

	@Override
	public void visitarAguila() {
		// TODO Auto-generated method stub

	}

}
