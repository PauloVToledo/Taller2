package model;

import java.util.ArrayList;
import java.util.List;

public class Seleccion {
	private String nombre;
	private String rankingFifa;
	private String bandera;
	private String id;
	private List<Jugador> jugadores = new ArrayList<>();

	public Seleccion(String nombre, String rankingFifa, String bandera, String id) {
		this.nombre = nombre;
		this.rankingFifa = rankingFifa;
		this.bandera = bandera;
		this.id = id;
	}

	public boolean agregarSeleccion() {
		return true;
	}

	public static Seleccion seleccionEncontrada(String nombre) {

		return null;
	}

	public ArrayList<Jugador> obtenerArqueros() {
		ArrayList<Jugador> arqueros = new ArrayList<>();
		for (Jugador jugador : jugadores) {
			if ("Arquero".equals(jugador.getPosicion())) {
				arqueros.add(jugador);
			}
		}
		return arqueros;
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

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
}
