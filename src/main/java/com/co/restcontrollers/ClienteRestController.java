package com.co.restcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.domain.Cliente;
import com.co.operaciones.ClienteOperaciones;
import com.co.services.interfaces.ICRUD;

@RestController
@RequestMapping("/clientes")
public class ClienteRestController {

	@Autowired
	ICRUD<Cliente> serviceClientes;

	@GetMapping("/listar")
	public ResponseEntity<Integer> consultar() {
		return ResponseEntity.status(HttpStatus.OK).body(serviceClientes.listAll().size());
	}

	@GetMapping("/crear")
	public ResponseEntity<String> insertar() {
		final Cliente nuevo = ClienteOperaciones.crearCliente();
		serviceClientes.save(nuevo);
		return ResponseEntity.status(HttpStatus.OK).body(nuevo.getNombre());
	}

	@GetMapping("/actualizar")
	public ResponseEntity<String> actualizar() {
		final Cliente actualizacion = ClienteOperaciones.obtenerCliente();
		serviceClientes.update(actualizacion);
		return ResponseEntity.status(HttpStatus.OK).body(actualizacion.getDireccion());
	}

	@GetMapping("/eliminar")
	public ResponseEntity<String> borrar() {
		serviceClientes.delete(ClienteOperaciones.obtenerCliente());
		ClienteOperaciones.crearCliente();
		return ResponseEntity.status(HttpStatus.OK).body("Cliente eliminado");
	}

}
