package com.co.restcontrollers.transacciones;

import com.co.domain.Cliente;

public class ClienteTransaccion {

	private ClienteTransaccion() {

	}

	private static boolean clienteNulo(Cliente clienteNulo) {
		return clienteNulo != null;
	}

	public static String mensajeActualizacion(Cliente actualizar) {
		return (clienteNulo(actualizar)) ? "Cliente Actualizado" : "El cliente NO existe, no se puede actualizar";
	}

	public static String mensajeEliminado(Cliente eliminar) {
		return (clienteNulo(eliminar)) ? "Cliente Eliminado" : "El cliente NO existe, no se puede eliminar";
	}

}
