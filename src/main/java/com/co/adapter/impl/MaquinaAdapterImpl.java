package com.co.adapter.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.co.adapter.interfaces.Adapter;
import com.co.domain.Maquina;
import com.co.entities.MaquinaEntity;

@Component
public class MaquinaAdapterImpl implements Adapter<Maquina, MaquinaEntity> {

	private ModelMapper mapper = new ModelMapper();

	@Override
	public Maquina convertTo(MaquinaEntity e) {
		return (e == null) ? null : mapper.map(e, Maquina.class);
	}

	@Override
	public MaquinaEntity convertFrom(Maquina d) {
		if (d == null) {
			return null;
		} else {
			MaquinaEntity entidad = new MaquinaEntity();
			// entidad.setId(d.getId());
			entidad.setModelo(d.getModelo());
			entidad.setModelo(d.getModelo());
			entidad.setCantidadJuegos(d.getCantidadJuegos());
			entidad.setPantallaTactil(d.isPantallaTactil());
			return entidad;
		}
	}

}
