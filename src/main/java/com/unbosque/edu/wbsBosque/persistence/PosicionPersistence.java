package com.unbosque.edu.wbsBosque.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unbosque.edu.wbsBosque.entity.Posicion;

public interface PosicionPersistence extends JpaRepository<Posicion, Integer> {

}