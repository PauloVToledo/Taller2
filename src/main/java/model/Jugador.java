package model;

import java.util.ArrayList;

public class Jugador {
	private String nombre;
	private String numero;
	private String posicion;
	private Seleccion seleccion;

	public Jugador() {
		throw new UnsupportedOperationException();
	}

	public boolean agregarJugador() {
		throw new UnsupportedOperationException();
	}

	public Jugador encontrarJugador() {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Jugador> obtenerJugador() {
		throw new UnsupportedOperationException();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getPosicion() {
		return this.posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
}