package com.co.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {
	
	private Integer id;
	private String nombre;
	private String direccion;
	private Casino casino;

}
