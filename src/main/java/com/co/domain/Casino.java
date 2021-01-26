package com.co.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Casino {
	
	private Integer id;
	private String nombre;
	private String direccion;
	private Integer cantidadMaquinas;
	private Maquina maquina;
		
	public Casino(Integer id, String nombre, String direccion, Integer cantidadMaquinas, Maquina maquina) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.cantidadMaquinas = cantidadMaquinas;
		this.maquina = maquina;
	}

}
