package com.co.operaciones;

import static com.co.constantes.ObjetosDominio.CLIENTE;

import com.co.domain.Cliente;

public class ClienteOperaciones {

	private ClienteOperaciones() {

	}

	public static Cliente crearCliente() {
		final String nombre = "Cliente ".concat(String.valueOf(0));
		final String direccion = "Direccion ".concat(String.valueOf(0));
		CLIENTE = new Cliente(0, nombre, direccion, CasinoOperaciones.crearCasino());

		return CLIENTE;
	}

	public static Cliente obtenerCliente() {
		return CLIENTE;
	}

	public static Cliente actualizarCliente() {
		CLIENTE.setNombre("Cliente ".concat(String.valueOf(CLIENTE.getId() + 1)));
		CLIENTE.setDireccion("Direccion ".concat(String.valueOf(CLIENTE.getId() + 1)));
		return CLIENTE;
	}

}
