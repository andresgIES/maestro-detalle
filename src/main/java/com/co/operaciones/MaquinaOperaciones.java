package com.co.operaciones;

import static com.co.constantes.Contadores.ID_MAQUINA;

import com.co.domain.Maquina;

public class MaquinaOperaciones {

	public static Maquina crearMaquina() {
		final String direccion = "Direccion ".concat(String.valueOf(ID_MAQUINA));
		final int cantidadJuegos = (int) (Math.random() * 5 + 1);
		final boolean pantallaTactil = (cantidadJuegos % 2 == 0);
		final Maquina maquina = new Maquina(ID_MAQUINA, direccion, cantidadJuegos, pantallaTactil);

		ID_MAQUINA++;

		return maquina;
	}

}
