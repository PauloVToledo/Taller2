package model.data.dao;

import model.Jugador;
import org.jooq.DSLContext;
import org.jooq.Table;

import java.util.ArrayList;

public class JugadorDAO {

	public boolean registrarJugador(DSLContext query, Jugador jugador) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Jugador> JugadoresEncontrados(DSLContext query, Jugador jugador) {
		throw new UnsupportedOperationException();
	}

	public boolean estaRegistrado(DSLContext query, Jugador jugador, Table table) {
		throw new UnsupportedOperationException();
	}
}