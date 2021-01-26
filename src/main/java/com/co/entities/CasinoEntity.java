package com.co.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "casinos")
public class CasinoEntity {
	
	@Id
	@Column(name = "idCasino", nullable = false, unique = true)
	private Integer id;
	
	@Column(name = "nombre", nullable = false)
	private String nombre;
	
	@Column(name = "direccion", nullable = false)
	private String direccion;
	
	@Column(name = "cantidad_maquinas", nullable = false)
	private Integer cantidadMaquinas;
	
	@OneToOne(cascade = { CascadeType.REMOVE, CascadeType.DETACH,
			CascadeType.REFRESH }, fetch = FetchType.LAZY)
	@JoinColumn(name = "id", nullable = false)
	private MaquinaEntity maquina;


}
