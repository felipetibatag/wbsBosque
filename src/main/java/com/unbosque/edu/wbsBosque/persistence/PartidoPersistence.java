package com.unbosque.edu.wbsBosque.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unbosque.edu.wbsBosque.entity.Partido;

public interface PartidoPersistence extends JpaRepository<Partido, Integer> {

}