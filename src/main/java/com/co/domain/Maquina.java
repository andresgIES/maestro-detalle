package com.co.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Maquina {

	private Integer id;
	private String modelo;
	private Integer cantidadJuegos;
	private boolean pantallaTactil;

	public Maquina(Integer id, String modelo, Integer cantidadJuegos, boolean pantallaTactil) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.cantidadJuegos = cantidadJuegos;
		this.pantallaTactil = pantallaTactil;
	}

	public Maquina() {
	}

}
