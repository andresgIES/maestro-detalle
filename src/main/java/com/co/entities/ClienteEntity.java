package com.co.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class ClienteEntity {
	
	@Id
	@Column(name = "idCliente", nullable = false, unique = true)
	private Integer id;
	private String nombre;
	private String direccion;
	private CasinoEntity casino;

}
