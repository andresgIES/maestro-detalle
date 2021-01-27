package com.co.operaciones;

import static com.co.constantes.ObjetosDominio.CASINO;

import com.co.domain.Casino;

public class CasinoOperaciones {

	private CasinoOperaciones() {
	}

	public static Casino crearCasino() {
		final String nombre = "Casino ".concat(String.valueOf(0));
		final String direccion = "Direccion ".concat(String.valueOf(0));
		final int cantidadMaquinas = (int) (Math.random() * 10 + 1);
		CASINO = new Casino(0, nombre, direccion, cantidadMaquinas, MaquinaOperaciones.crearMaquina());

		return CASINO;
	}

}
