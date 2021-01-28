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
import com.co.services.interfaces.FindBy;

@Service
public class ClienteServiceImpl implements ICRUD<Cliente>, FindBy<Cliente> {

	@Autowired
	ClienteRepository repository;

	@Autowired
	Adapter<Cliente, ClienteEntity> adapter;

	@Override
	public void save(Cliente d) {
		final ClienteEntity entidad = adapter.convertFrom(d);
		repository.save(entidad);
	}

	@Override
	public void update(Cliente d) {
		ClienteEntity entidad = adapter.convertFrom(d);
		repository.updateByidentificacion(entidad.getNombre(), entidad.getDireccion(), entidad.getId());
	}

	@Override
	public void delete(Cliente d) {
		repository.deleteById((d.getId()));
	}

	@Override
	public List<Cliente> listAll() {
		final List<ClienteEntity> entidades = repository.findAll();
		List<Cliente> maquinas = new ArrayList<>(entidades.size());
		entidades.forEach(entidad -> maquinas.add(adapter.convertTo(entidad)));
		return maquinas;
	}

	@Override
	public Cliente findById(Integer id) {
		return adapter.convertTo(repository.findById(id).orElse(null));
	}

}
