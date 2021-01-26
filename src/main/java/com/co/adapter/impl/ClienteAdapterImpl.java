package com.co.adapter.impl;

import org.modelmapper.ModelMapper;

import com.co.adapter.interfaces.Adapter;
import com.co.domain.Cliente;
import com.co.entities.ClienteEntity;

public class ClienteAdapterImpl implements Adapter<Cliente, ClienteEntity> {
	
	private ModelMapper mapper = new ModelMapper();

	@Override
	public Cliente convertTo(ClienteEntity e) {
		return (e == null ) ? null : mapper.map(e, Cliente.class);
	}

	@Override
	public ClienteEntity convertFrom(Cliente d) {
		return (d == null ) ? null : mapper.map(d, ClienteEntity.class);
	}

}
