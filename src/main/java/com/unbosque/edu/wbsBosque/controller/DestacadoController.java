package com.unbosque.edu.wbsBosque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.unbosque.edu.wbsBosque.entity.Destacado;
import com.unbosque.edu.wbsBosque.entity.Equipo;
import com.unbosque.edu.wbsBosque.entity.Posicion;
import com.unbosque.edu.wbsBosque.persistence.DestacadoPersistence;

@RestController

public class DestacadoController {
	
	@Autowired
	DestacadoPersistence pp;
	@RequestMapping(value="/destacado/add",method=RequestMethod.POST)
	public Destacado addDestacado(@RequestParam String nombre, String resena, Equipo idEquipo, Posicion idPosicion){
		Destacado p=pp.save( new Destacado(nombre, resena, idEquipo, idPosicion ));
		return p;
	}
	@RequestMapping(value="/destacado/delete",method=RequestMethod.POST)
	public void deleteDestacado(@RequestParam Integer id) {
		Destacado p = pp.getOne(id);
		 pp.delete(p);
	}
	@RequestMapping(value="/destacado/set",method=RequestMethod.POST)
	public Destacado setDestacado(@RequestParam Integer id, String nombre, String resena, Equipo idEquipo, Posicion idPosicion) {
		Destacado p = pp.save(new Destacado(id, nombre, resena, idEquipo, idPosicion));
		return p;
	}
	@RequestMapping(value="/destacado/select",method=RequestMethod.POST)
	public Destacado findDestacado(@RequestParam Integer id) {
		Destacado p = pp.findOne(id);
		//System.out.println(p.toString());
		return p;
	}
	@RequestMapping(value="/destacado/selectAll",method=RequestMethod.POST)
	public List<Destacado> findAllDestacado() {
		List<Destacado> p = pp.findAll();
		return p;
	}



}
