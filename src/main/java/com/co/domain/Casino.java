package com.co.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Casino {
	
	private Integer id;
	private String nombre;
	private String direccion;
	private Integer cantidadMaquinas;
	private Maquina maquina;

}
