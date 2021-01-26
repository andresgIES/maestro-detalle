package com.co.adapter.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.co.adapter.interfaces.Adapter;
import com.co.domain.Casino;
import com.co.domain.Cliente;
import com.co.entities.CasinoEntity;
import com.co.entities.ClienteEntity;

@Component
public class ClienteAdapterImpl implements Adapter<Cliente, ClienteEntity> {

	@Autowired
	Adapter<Casino, CasinoEntity> casinoMapper;

	@Override
	public Cliente convertTo(ClienteEntity e) {
		if (e == null) {
			return null;
		} else {
			return new Cliente(e.getId(), e.getNombre(), e.getDireccion(), casinoMapper.convertTo(e.getCasino()));
		}
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

}
