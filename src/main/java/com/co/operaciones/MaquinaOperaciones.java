package com.co.operaciones;

import com.co.domain.Maquina;

public class MaquinaOperaciones {

	private MaquinaOperaciones() {

	}

	public static Maquina crearMaquina() {
		final String direccion = "Direccion ".concat(String.valueOf(0));
		final int cantidadJuegos = (int) (Math.random() * 5 + 1);
		final boolean pantallaTactil = (cantidadJuegos % 2 == 0);
		return new Maquina(0, direccion, cantidadJuegos, pantallaTactil);
	}

}
