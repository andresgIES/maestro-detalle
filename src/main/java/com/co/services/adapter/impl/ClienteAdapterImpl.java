package com.co.services.adapter.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.co.domain.Casino;
import com.co.domain.Cliente;
import com.co.persistencia.entities.CasinoEntity;
import com.co.persistencia.entities.ClienteEntity;
import com.co.services.adapter.AdapterFull;
import com.co.services.adapter.AdapterPartial;

@Component
public class ClienteAdapterImpl implements AdapterFull<Cliente, ClienteEntity>, AdapterPartial<Cliente, ClienteEntity> {

	@Autowired
	AdapterFull<Casino, CasinoEntity> casinoMapper;

	@Override
	public Cliente convertTo(ClienteEntity e) {
		return (e == null) ? null
				: new Cliente(e.getId(), e.getNombre(), e.getDireccion(), casinoMapper.convertTo(e.getCasino()));
	}

	@Override
	public ClienteEntity convertFrom(Cliente d) {
		if (d == null) {
			return null;
		} else {
			ClienteEntity entidad = new ClienteEntity();
			entidad.setId(d.getId());
			entidad.setNombre(d.getNombre());
			entidad.setDireccion(d.getDireccion());
			entidad.setCasino(casinoMapper.convertFrom(d.getCasino()));
			return entidad;
		}
	}

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
