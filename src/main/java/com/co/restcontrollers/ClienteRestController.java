package com.co.restcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.domain.Casino;
import com.co.domain.Cliente;
import com.co.domain.Maquina;
import com.co.operaciones.CasinoOperaciones;
import com.co.operaciones.ClienteOperaciones;
import com.co.operaciones.MaquinaOperaciones;
import com.co.services.interfaces.ICRUD;

@RestController
@RequestMapping("/clientes")
public class ClienteRestController {

	@Autowired
	ICRUD<Cliente> serviceClientes;
	
	@Autowired
	ICRUD<Maquina> serviceMaquina;
	
	@Autowired
	ICRUD<Casino> serviceCasinos;

	@GetMapping("/listar")
	public ResponseEntity<Integer> consultar() {
		serviceClientes.listAll();
		return ResponseEntity.status(HttpStatus.OK).body(serviceClientes.listAll().size());
	}

	@GetMapping("/crear")
	public ResponseEntity<Integer> insertar() {
		serviceMaquina.save(MaquinaOperaciones.crearMaquina());
		serviceCasinos.save(CasinoOperaciones.crearCasino());
		final Cliente cliente = ClienteOperaciones.crearCliente();
		serviceClientes.save(cliente);
		return ResponseEntity.status(HttpStatus.OK).build();
	}

	@PutMapping("/actualizar")
	public ResponseEntity<Integer> actualizar() {
		serviceClientes.save(null);
		return ResponseEntity.status(HttpStatus.OK).build();
	}

	@DeleteMapping("/eliminar")
	public ResponseEntity<Integer> borrar() {
		serviceClientes.save(null);
		return ResponseEntity.status(HttpStatus.OK).build();
	}

}
