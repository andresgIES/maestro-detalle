package com.co.operaciones;

import com.co.domain.Cliente;

public class ClienteOperaciones {

	private ClienteOperaciones() {

	}

	public static Cliente crearCliente() {
		return new Cliente(0, "Cliente Y", "Direccion X", CasinoOperaciones.crearCasino());
	}

}
