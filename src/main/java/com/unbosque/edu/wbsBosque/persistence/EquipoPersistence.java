package com.unbosque.edu.wbsBosque.persistence;

import com.unbosque.edu.wbsBosque.entity.EstadisticaGeneral;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.unbosque.edu.wbsBosque.entity.Equipo;
import org.springframework.data.jpa.repository.query.Procedure;

import javax.persistence.PersistenceContext;
import java.util.List;

public interface EquipoPersistence extends JpaRepository<Equipo, Integer>{

    List<Equipo> findByGrupoIsNotOrderByGrupoAsc(String grupo);


}