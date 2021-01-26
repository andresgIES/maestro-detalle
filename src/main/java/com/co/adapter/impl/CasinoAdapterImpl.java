package com.co.adapter.impl;

import org.modelmapper.ModelMapper;

import com.co.adapter.interfaces.Adapter;
import com.co.domain.Casino;
import com.co.entities.CasinoEntity;

public class CasinoAdapterImpl implements Adapter<Casino, CasinoEntity> {
	
	private ModelMapper mapper = new ModelMapper();

	@Override
	public Casino convertTo(CasinoEntity e) {
		return (e == null) ? null : mapper.map(e, Casino.class);
	}

	@Override
	public CasinoEntity convertFrom(Casino d) {
		return (d == null ) ? null : mapper.map(d, CasinoEntity.class);
	}

}
