package model.data.dao;

import model.Seleccion;
import org.jooq.DSLContext;
import org.jooq.Table;

public class SeleccionDAO {

	public boolean registrarSeleccion(DSLContext query, Seleccion seleccion) {
		throw new UnsupportedOperationException();
	}

	public boolean existeSeleccionOCodigo(DSLContext query, Table table, Seleccion seleccion) {
		throw new UnsupportedOperationException();
	}

	public Seleccion encontrarSeleccion(DSLContext query, String nombreSeleccion) {
		throw new UnsupportedOperationException();
	}
}