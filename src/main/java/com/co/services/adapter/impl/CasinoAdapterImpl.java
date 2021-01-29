package com.co.services.adapter.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.co.domain.Casino;
import com.co.domain.Maquina;
import com.co.persistencia.entities.CasinoEntity;
import com.co.persistencia.entities.MaquinaEntity;
import com.co.services.adapter.AdapterFull;

@Component
public class CasinoAdapterImpl implements AdapterFull<Casino, CasinoEntity> {

	@Autowired
	private AdapterFull<Maquina, MaquinaEntity> maquinaMapper;

	@Override
	public Casino convertTo(CasinoEntity e) {
		return (e == null) ? null
				: new Casino(e.getId(), e.getNombre(), e.getDireccion(), e.getCantidadMaquinas(),
						maquinaMapper.convertTo(e.getMaquina()));
	}

	@Override
	public CasinoEntity convertFrom(Casino d) {
		if (d == null) {
			return null;
		} else {
			CasinoEntity entidad = new CasinoEntity();
			entidad.setNombre(d.getNombre());
			entidad.setDireccion(d.getDireccion());
			entidad.setCantidadMaquinas(d.getCantidadMaquinas());
			entidad.setMaquina(maquinaMapper.convertFrom(d.getMaquina()));
			return entidad;
		}
	}

}
