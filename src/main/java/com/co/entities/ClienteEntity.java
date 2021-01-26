package com.co.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "clientes")
public class ClienteEntity {

	@Id
	@Column(name = "idCliente", nullable = false, unique = true)
	private Integer id;

	@Column(name = "nombre", nullable = false)
	private String nombre;

	@Column(name = "direccion", nullable = false)
	private String direccion;

	@OneToOne(cascade = { CascadeType.REMOVE, CascadeType.DETACH, CascadeType.REFRESH }, fetch = FetchType.LAZY)
	@JoinColumn(name = "id", nullable = false)
	private CasinoEntity casino;

}