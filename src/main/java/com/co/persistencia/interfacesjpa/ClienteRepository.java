package com.co.persistencia.interfacesjpa;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.co.persistencia.entities.ClienteEntity;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Integer> {

	@Transactional
	@Modifying
	@Query(value = "update from ClienteEntity set nombre=:nombre, direccion=:direccion where id=:id")
	public void updateByidentificacion(@Param("nombre") String nombre, @Param("direccion") String direccion,
			@Param("id") Integer id);

}
