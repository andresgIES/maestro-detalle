package com.co.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class ClienteEntity {
	
	private Integer id;
	private String nombre;
	private String direccion;
	private CasinoEntity casino;

}
