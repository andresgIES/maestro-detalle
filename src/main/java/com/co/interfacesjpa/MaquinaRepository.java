package com.co.interfacesjpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.co.entities.MaquinaEntity;

public interface MaquinaRepository extends JpaRepository<MaquinaEntity, Long> {

}
