package com.co.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.co.adapter.interfaces.Adapter;
import com.co.domain.Cliente;
import com.co.entities.ClienteEntity;
import com.co.interfacesjpa.ClienteRepository;
import com.co.services.interfaces.ICRUD;

@Service
public class ClienteServiceImpl implements ICRUD<Cliente> {

	@Autowired
	ClienteRepository repository;
	Adapter<Cliente, ClienteEntity> adapter;

	@Override
	public void save(Cliente d) {
		final ClienteEntity entidad = adapter.convertFrom(d);
		repository.save(entidad);
	}

	@Override
	public void update(Cliente d) {
		final ClienteEntity entidad = adapter.convertFrom(d);
		repository.save(entidad);
	}

	@Override
	public void delete(Cliente d) {
		final ClienteEntity entidad = adapter.convertFrom(d);
		repository.delete(entidad);

	}

	@Override
	public List<Cliente> listAll() {
		final List<ClienteEntity> entidades = repository.findAll();
		List<Cliente> maquinas = new ArrayList<>(entidades.size());
		entidades.forEach(entidad -> maquinas.add(adapter.convertTo(entidad)));
		return maquinas;
	}

}