package com.unbosque.edu.wbsBosque.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unbosque.edu.wbsBosque.entity.Destacado;

public interface DestacadoPersistence extends JpaRepository<Destacado, Integer> {

}