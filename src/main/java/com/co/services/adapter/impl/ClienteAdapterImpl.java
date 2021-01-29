package com.co.services.adapter.impl;

import org.springframework.stereotype.Component;

import com.co.domain.Cliente;
import com.co.persistencia.entities.ClienteEntity;
import com.co.services.adapter.AdapterPartial;

@Component
public class ClienteAdapterImpl implements AdapterPartial<Cliente, ClienteEntity> {

	@Override
	public Cliente convertToWithPropertiesNull(ClienteEntity e) {
		return (e == null) ? null : new Cliente(e.getId(), e.getNombre(), e.getDireccion(), null);
	}

	@Override
	public ClienteEntity convertFromWithPropertiesNull(Cliente d) {
		if (d == null) {
			return null;
		} else {
			ClienteEntity entidad = new ClienteEntity();
			entidad.setId(d.getId());
			entidad.setNombre(d.getNombre());
			entidad.setDireccion(d.getDireccion());
			return entidad;
		}
	}

}
