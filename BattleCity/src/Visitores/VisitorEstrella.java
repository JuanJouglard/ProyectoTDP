package Visitores;

import Objetos.Enemigo;
import Objetos.Jugador;
import Objetos.Obstaculo;
import Objetos.Tanque;

public class VisitorEstrella extends Visitor {

	@Override
	public void VistarTanque(Tanque t, int x) {
		// TODO Auto-generated method stub

	}

	@Override
	public void VisitarObstaculo(Obstaculo o) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitarJugador(Jugador j) {
		j.subirNivel();

	}

	@Override
	public void visitarEnemigo(Enemigo e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitarAguila() {
		// TODO Auto-generated method stub

	}

}