package com.co.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.co.adapter.interfaces.Adapter;
import com.co.domain.Maquina;
import com.co.entities.MaquinaEntity;
import com.co.interfacesjpa.MaquinaRepository;
import com.co.services.interfaces.ICRUD;

@Service
public class MaquinaServiceImpl implements ICRUD<Maquina> {

	@Autowired
	MaquinaRepository repository;
	Adapter<Maquina, MaquinaEntity> adapter;

	@Override
	public void save(Maquina d) {
		final MaquinaEntity entidad = adapter.convertFrom(d);
		repository.save(entidad);
	}

	@Override
	public void update(Maquina d) {
		final MaquinaEntity entidad = adapter.convertFrom(d);
		repository.save(entidad);
	}

	@Override
	public void delete(Maquina d) {
		final MaquinaEntity entidad = adapter.convertFrom(d);
		repository.delete(entidad);

	}

	@Override
	public List<Maquina> listAll() {
		final List<MaquinaEntity> entidades = repository.findAll();
		List<Maquina> maquinas = new ArrayList<>(entidades.size());
		entidades.forEach(entidad -> maquinas.add(adapter.convertTo(entidad)));
		return maquinas;
	}

}
