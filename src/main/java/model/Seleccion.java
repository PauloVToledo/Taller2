package model;

import model.Jugador;
import model.Jugador;

import java.util.ArrayList;

public class Seleccion {
	private String nombre;
	private String rankingFifa;
	private String bandera;
	private String id;
	private Jugador jugadores = new Jugador();

	public ArrayList<Jugador> obtenerArqueros(Jugador jugador) {
		throw new UnsupportedOperationException();
	}

	public Seleccion(String nombre, String rankingFifa, String bandera, String id) {
		throw new UnsupportedOperationException();
	}

	public boolean agregarSeleccion() {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Seleccion> SeleccionEncontrada() {
		throw new UnsupportedOperationException();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRankingFifa() {
		return this.rankingFifa;
	}

	public void setRankingFifa(String rankingFifa) {
		this.rankingFifa = rankingFifa;
	}

	public String getBandera() {
		return this.bandera;
	}

	public void setBandera(String bandera) {
		this.bandera = bandera;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}
}