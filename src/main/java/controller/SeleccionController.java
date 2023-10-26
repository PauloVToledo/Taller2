package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SeleccionController {
	private Map<String, Seleccion> selecciones = new HashMap<>();

	public boolean registrarSeleccion(String nombreSeleccion, String id, String rankingFifa, String bandera) {
		// Verificar si la selección ya existe en el mapa
		if (selecciones.containsKey(nombreSeleccion)) {
			return false; // La selección ya existe, no se puede registrar nuevamente
		}

		// Crear una nueva instancia de Seleccion y agregarla al mapa
		Seleccion nuevaSeleccion = new Seleccion(id, nombreSeleccion, rankingFifa, bandera);
		selecciones.put(nombreSeleccion, nuevaSeleccion);
		return true; // Registro exitoso
	}

	public ArrayList<String> obtenerNombreSelecciones() {
		// Crear una lista de nombres de selecciones
		ArrayList<String> nombres = new ArrayList<>();
		for (Seleccion seleccion : selecciones.values()) {
			nombres.add(seleccion.getNombreSeleccion());
		}
		return nombres;
	}

	// Clase interna para representar una selección
	private class Seleccion {
		private String id;
		private String nombreSeleccion;
		private String rankingFifa;
		private String bandera;

		public Seleccion(String id, String nombreSeleccion, String rankingFifa, String bandera) {
			this.id = id;
			this.nombreSeleccion = nombreSeleccion;
			this.rankingFifa = rankingFifa;
			this.bandera = bandera;
		}

		public String getId() {
			return id;
		}

		public String getNombreSeleccion() {
			return nombreSeleccion;
		}

		public String getRankingFifa() {
			return rankingFifa;
		}

		public String getBandera() {
			return bandera;
		}
	}
}
