package com.co.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "maquinas")
public class MaquinaEntity {
	
	private Integer id;
	private String modelo;
	private Integer cantidadJuegos;
	private boolean pantallaTactil;

}
