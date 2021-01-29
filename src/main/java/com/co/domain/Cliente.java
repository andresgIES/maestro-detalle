package com.co.domain;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Cliente {

	private Integer id;
	private String nombre;
	private String direccion;
	private Casino casino;

	public Cliente(Integer id, String nombre, String direccion, Casino casino) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.casino = casino;
	}

}
