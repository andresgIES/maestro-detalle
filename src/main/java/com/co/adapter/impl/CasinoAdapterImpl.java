package com.co.adapter.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.co.adapter.interfaces.Adapter;
import com.co.domain.Casino;
import com.co.domain.Maquina;
import com.co.entities.CasinoEntity;
import com.co.entities.MaquinaEntity;

@Component
public class CasinoAdapterImpl implements Adapter<Casino, CasinoEntity> {

	@Autowired
	Adapter<Maquina, MaquinaEntity> maquinaMapper;

	@Override
	public Casino convertTo(CasinoEntity e) {
		if (e == null) {
			return null;
		} else {
			return new Casino(e.getId(), e.getNombre(), e.getDireccion(), e.getCantidadMaquinas(),
					maquinaMapper.convertTo(e.getMaquina()));
		}
	}

	@Override
	public CasinoEntity convertFrom(Casino d) {
		if (d == null) {
			return null;
		} else {
			CasinoEntity entidad = new CasinoEntity();
			entidad.setId(d.getId());
			entidad.setNombre(d.getNombre());
			entidad.setDireccion(d.getDireccion());
			entidad.setCantidadMaquinas(d.getCantidadMaquinas());
			entidad.setMaquina(maquinaMapper.convertFrom(d.getMaquina()));
			return entidad;
		}
	}

}
