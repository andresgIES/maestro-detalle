package com.co.adapter.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.co.adapter.Adapter;
import com.co.domain.Maquina;
import com.co.entities.MaquinaEntity;

@Component
public class MaquinaAdapterImpl implements Adapter<Maquina, MaquinaEntity> {

	private ModelMapper mapper = new ModelMapper();

	@Override
	public Maquina convertTo(MaquinaEntity e) {
		return (e == null) ? null : mapper.map(e, Maquina.class);
	}

	@Override
	public MaquinaEntity convertFrom(Maquina d) {
		return (d == null) ? null : mapper.map(d, MaquinaEntity.class);
	}

}
