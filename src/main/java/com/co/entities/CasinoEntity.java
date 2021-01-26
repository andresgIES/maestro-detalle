package com.co.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "casinos")
public class CasinoEntity {
	
	private Integer id;
	private String nombre;
	private String direccion;
	private Integer cantidadMaquinas;
	private MaquinaEntity maquina;


}
