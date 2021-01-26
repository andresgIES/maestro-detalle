package com.co.operaciones;

import static com.co.constantes.Contadores.ID_CASINO;

import com.co.domain.Casino;

public class CasinoOperaciones {

	public static Casino crearCasino() {
		final String nombre = "Casino ".concat(String.valueOf(ID_CASINO));
		final String direccion = "Direccion ".concat(String.valueOf(ID_CASINO));
		final int cantidadMaquinas = (int) (Math.random() * 10 + 1);
		final Casino casino = new Casino(ID_CASINO, nombre, direccion, cantidadMaquinas, null);

		ID_CASINO++;

		return casino;
	}

}
