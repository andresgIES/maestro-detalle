package com.co.interfacesjpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.co.entities.ClienteEntity;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {

}
