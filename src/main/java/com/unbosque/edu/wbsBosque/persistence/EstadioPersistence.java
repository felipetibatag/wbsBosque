package com.unbosque.edu.wbsBosque.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unbosque.edu.wbsBosque.entity.Estadio;

public interface EstadioPersistence extends JpaRepository<Estadio, Integer> {

}