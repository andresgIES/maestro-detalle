package com.co.operaciones;

import static com.co.constantes.Contadores.ID_CLIENTE;

import com.co.domain.Cliente;

public class ClienteOperaciones {
	
	public static Cliente crearCliente () {
		final String nombre = "Cliente ".concat(String.valueOf(ID_CLIENTE));
		final String direccion = "Direccion ".concat(String.valueOf(ID_CLIENTE));
		final Cliente cliente = new Cliente(ID_CLIENTE, nombre, direccion, null);
		
		ID_CLIENTE++;
		
		return cliente;
	}

}
