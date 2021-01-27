package com.co.restcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.domain.Cliente;
import com.co.operaciones.ClienteOperaciones;
import com.co.services.interfaces.ConsultLast;
import com.co.services.interfaces.ICRUD;

@RestController
@RequestMapping("/clientes")
public class ClienteRestController {

	@Autowired
	ICRUD<Cliente> serviceClientes;

	@Autowired
	ConsultLast<Cliente> serviceUltimoRegistro;

	@GetMapping("/listar")
	public ResponseEntity<Integer> consultar() {
		final int clientesCantidad = serviceClientes.listAll().size();
		return ResponseEntity.status(HttpStatus.OK).body(clientesCantidad);
	}

	@GetMapping("/crear")
	public ResponseEntity<String> insertar() {
		Cliente nuevo = ClienteOperaciones.crearCliente();
		serviceClientes.save(nuevo);
		return ResponseEntity.status(HttpStatus.OK).body("Exito, nuevo cliente creado");
	}

	@GetMapping("/actualizar")
	public ResponseEntity<String> actualizar() {
		final Cliente actualizar = serviceUltimoRegistro.consultLast();
		String mensajeActualizacion = "";
		if (actualizar != null) {
			serviceClientes.update(actualizar);
			mensajeActualizacion = "Cliente Actualizado";
		} else {
			mensajeActualizacion = "No hay Clientes para Actualizar";
		}
		return ResponseEntity.status(HttpStatus.OK).body(mensajeActualizacion);
	}

	@GetMapping("/eliminar")
	public ResponseEntity<String> borrar() {
		final Cliente eliminar = serviceUltimoRegistro.consultLast();
		String mensajeEliminado = "";
		if (eliminar != null) {
			serviceClientes.delete(eliminar);
			mensajeEliminado = "Cliente eliminado";
		} else {
			mensajeEliminado = "No hay Clientes para Eliminar";
		}
		return ResponseEntity.status(HttpStatus.OK).body(mensajeEliminado);
	}

}
