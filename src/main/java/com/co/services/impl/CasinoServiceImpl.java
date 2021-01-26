package com.co.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.co.adapter.interfaces.Adapter;
import com.co.domain.Casino;
import com.co.entities.CasinoEntity;
import com.co.interfacesjpa.CasinoRepository;
import com.co.services.interfaces.ICRUD;

public class CasinoServiceImpl implements ICRUD<Casino> {

	@Autowired
	CasinoRepository repository;
	Adapter<Casino, CasinoEntity> adapter;

	@Override
	public void save(Casino d) {
		final CasinoEntity entidad = adapter.convertFrom(d);
		repository.save(entidad);
	}

	@Override
	public void update(Casino d) {
		final CasinoEntity entidad = adapter.convertFrom(d);
		repository.save(entidad);
	}

	@Override
	public void delete(Casino d) {
		final CasinoEntity entidad = adapter.convertFrom(d);
		repository.delete(entidad);

	}

	@Override
	public List<Casino> listAll() {
		final List<CasinoEntity> entidades = repository.findAll();
		List<Casino> maquinas = new ArrayList<>(entidades.size());
		entidades.forEach(entidad -> maquinas.add(adapter.convertTo(entidad)));
		return maquinas;
	}

}
