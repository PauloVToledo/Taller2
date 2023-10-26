package model;

import java.util.ArrayList;

public class Jugador {
	private String nombre;
	private String numero;
	private String posicion;
	private Seleccion seleccion;

	public Jugador() {
		this.nombre = nombre;
		this.numero = numero;
		this.posicion = posicion;
		this.seleccion = seleccion;
	}

	public boolean agregarJugador() {

		return true;
	}

	public static Jugador encontrarJugador(String nombre) {

		return null;
	}

	public static ArrayList<Jugador> obtenerJugadores() {

		return new ArrayList<>();
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

	public Seleccion getSeleccion() {
		return this.seleccion;
	}

	public void setSeleccion(Seleccion seleccion) {
		this.seleccion = seleccion;
	}
}
