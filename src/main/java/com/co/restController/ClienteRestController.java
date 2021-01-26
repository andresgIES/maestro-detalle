package com.co.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.domain.Cliente;
import com.co.services.interfaces.ICRUD;

@RestController
@RequestMapping("/clientes")
public class ClienteRestController {

	@Autowired
	ICRUD<Cliente> serviceClientes;

	@GetMapping("/listar")
	public ResponseEntity<Integer> consultar() {
		serviceClientes.listAll();
		return ResponseEntity.status(HttpStatus.OK).body(serviceClientes.listAll().size());
	}

}
