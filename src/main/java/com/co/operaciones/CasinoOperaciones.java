package com.co.operaciones;

import com.co.domain.Casino;

public class CasinoOperaciones {

	private CasinoOperaciones() {
	}

	public static Casino crearCasino() {
		final String nombre = "Casino X";
		final String direccion = "Direccion Y";
		final int cantidadMaquinas = (int) (Math.random() * 10 + 1);
		return new Casino(0, nombre, direccion, cantidadMaquinas, MaquinaOperaciones.crearMaquina());
	}

}
