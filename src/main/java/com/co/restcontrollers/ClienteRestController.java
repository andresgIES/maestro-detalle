package com.co.restcontrollers;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.domain.Cliente;
import com.co.restcontrollers.transacciones.ClienteTransaccion;
import com.co.services.FindBy;
import com.co.services.ICRUD;

@RestController
@RequestMapping("/clientes")
public class ClienteRestController {

	@Autowired
	ICRUD<Cliente> serviceClientes;

	@Autowired
	FindBy<Cliente> serviceEncontrarCliente;

	@GetMapping("/listar")
	public ResponseEntity<List<Cliente>> consultar() {
		return ResponseEntity.status(HttpStatus.OK).body(serviceClientes.listAll());
	}

	@PostMapping("/crear")
	public ResponseEntity<String> insertar(@RequestBody Cliente cliente) {
		serviceClientes.save(cliente);
		return ResponseEntity.status(HttpStatus.OK)
				.body("Nuevo cliente creado con nombre: ".concat(cliente.getNombre()));
	}

	@PutMapping("/actualizar")
	public ResponseEntity<String> actualizar(@RequestBody Cliente cliente) {
		final Cliente clienteActualizar = serviceEncontrarCliente.findById(cliente.getId());
		if (Objects.nonNull(clienteActualizar)) {
			serviceClientes.update(cliente);
		}
		return ResponseEntity.status(HttpStatus.OK).body(ClienteTransaccion.mensajeActualizacion(clienteActualizar));
	}

	@DeleteMapping("/eliminar")
	public ResponseEntity<String> borrar(@RequestBody Cliente cliente) {
		final Cliente clienteEliminar = serviceEncontrarCliente.findById(cliente.getId());
		if (Objects.nonNull(clienteEliminar)) {
			serviceClientes.delete(clienteEliminar);
		}
		return ResponseEntity.status(HttpStatus.OK).body(ClienteTransaccion.mensajeEliminado(clienteEliminar));
	}

}
