package com.unbosque.edu.wbsBosque.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unbosque.edu.wbsBosque.entity.Usuario;

public interface UsuarioPersistence extends JpaRepository<Usuario, Integer> {

}