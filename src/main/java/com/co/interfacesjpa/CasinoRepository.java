package com.co.interfacesjpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.co.entities.CasinoEntity;

public interface CasinoRepository extends JpaRepository<CasinoEntity, Long> {

}
