package com.co.transacciones;

import com.co.domain.Cliente;

public class ClienteTransaccion {

	private ClienteTransaccion() {

	}

	public static boolean estadoCliente(Cliente clienteNulo) {
		return clienteNulo != null;
	}

	public static String mensajeActualizacion(Cliente actualizar) {
		return (estadoCliente(actualizar)) ? "Cliente Actualizado" : "No hay Clientes para Actualizar";
	}

	public static String mensajeEliminado(Cliente eliminar) {
		return (estadoCliente(eliminar)) ? "Cliente Eliminado" : "No hay Clientes para Eliminar";
	}

}
