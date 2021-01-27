package com.co.operaciones;

import static com.co.constantes.ObjetosDominio.MAQUINA;

import com.co.domain.Maquina;

public class MaquinaOperaciones {

	private MaquinaOperaciones() {

	}

	public static Maquina crearMaquina() {
		final String direccion = "Direccion ".concat(String.valueOf(0));
		final int cantidadJuegos = (int) (Math.random() * 5 + 1);
		final boolean pantallaTactil = (cantidadJuegos % 2 == 0);
		MAQUINA = new Maquina(0, direccion, cantidadJuegos, pantallaTactil);

		return MAQUINA;
	}

}
