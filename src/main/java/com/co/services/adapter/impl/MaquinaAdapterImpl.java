package com.co.services.adapter.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.co.domain.Maquina;
import com.co.persistencia.entities.MaquinaEntity;
import com.co.services.adapter.AdapterFull;

@Component
public class MaquinaAdapterImpl implements AdapterFull<Maquina, MaquinaEntity> {

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
