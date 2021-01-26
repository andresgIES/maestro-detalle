package com.co.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "casinos")
public class CasinoEntity {
	
	@Id
	@Column(name = "idCasino", nullable = false, unique = true)
	private Integer id;
	private String nombre;
	private String direccion;
	private Integer cantidadMaquinas;
	private MaquinaEntity maquina;


}
