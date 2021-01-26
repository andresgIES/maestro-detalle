package com.co.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "maquinas")
public class MaquinaEntity {
	
	@Id
	@Column(name = "idMaquina", nullable = false, unique = true)
	private Integer id;
	private String modelo;
	private Integer cantidadJuegos;
	private boolean pantallaTactil;

}
