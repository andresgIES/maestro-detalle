package com.co.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.co.domain.Cliente;
import com.co.persistencia.entities.ClienteEntity;
import com.co.persistencia.interfacesjpa.ClienteRepository;
import com.co.services.FindBy;
import com.co.services.ICRUD;
import com.co.services.adapter.AdapterPartial;

@Service
public class ClienteServiceImpl implements ICRUD<Cliente>, FindBy<Cliente> {

	private final ClienteRepository repository;
	private final AdapterPartial<Cliente, ClienteEntity> adapterPartial;

	@Autowired
	public ClienteServiceImpl(ClienteRepository repository, AdapterPartial<Cliente, ClienteEntity> adapterPartial) {
		this.repository = repository;
		this.adapterPartial = adapterPartial;
	}

	@Override
	public void save(Cliente d) {
		final ClienteEntity entidad = adapterPartial.convertFromWithPropertiesNull(d);
		repository.save(entidad);
	}

	@Override
	public void update(Cliente d) {
		ClienteEntity entidad = adapterPartial.convertFromWithPropertiesNull(d);
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
		entidades.forEach(entidad -> maquinas.add(adapterPartial.convertToWithPropertiesNull(entidad)));
		return maquinas;
	}

	@Override
	public Cliente findById(Integer id) {
		return adapterPartial.convertToWithPropertiesNull(repository.findById(id).orElse(null));
	}

}
