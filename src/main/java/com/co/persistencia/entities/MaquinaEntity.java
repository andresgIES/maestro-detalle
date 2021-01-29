package com.co.persistencia.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "maquinas")
public class MaquinaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_maquina", nullable = false, unique = true)
	private Integer id;

	@Column(name = "modelo", nullable = false)
	private String modelo;

	@Column(name = "cantidad_juegos", nullable = false)
	private Integer cantidadJuegos;

	@Column(name = "pantalla_tactil", nullable = false)
	private boolean pantallaTactil;

}
