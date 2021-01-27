package com.co.interfacesjpa;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.co.entities.ClienteEntity;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {

	@Transactional
	@Modifying
	@Query(value = "update from ClienteEntity set nombre=:nombre, direccion=:direccion where id=:id")
	void updateByidentificacion(@Param("nombre") String nombre, @Param("direccion") String direccion,
			@Param("identificacion") Integer id);

}
