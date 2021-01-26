package com.co.operaciones;

import static com.co.constantes.Contadores.ID_CLIENTE;
import static com.co.constantes.ObjetosDominio.CLIENTE;

import com.co.domain.Cliente;

public class ClienteOperaciones {

	private ClienteOperaciones() {

	}

	public static Cliente crearCliente() {
		final String nombre = "Cliente ".concat(String.valueOf(ID_CLIENTE));
		final String direccion = "Direccion ".concat(String.valueOf(ID_CLIENTE));
		CLIENTE = new Cliente(ID_CLIENTE, nombre, direccion, CasinoOperaciones.crearCasino());

		ID_CLIENTE++;

		return CLIENTE;
	}

}
