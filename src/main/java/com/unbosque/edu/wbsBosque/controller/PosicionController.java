package com.unbosque.edu.wbsBosque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.unbosque.edu.wbsBosque.entity.Posicion;
import com.unbosque.edu.wbsBosque.persistence.PosicionPersistence;

@RestController

public class PosicionController {
	
	@Autowired
	PosicionPersistence pp;
	@RequestMapping(value="/posicion/add",method=RequestMethod.POST)
	public Posicion addPosicion(@RequestParam String nombre){
		Posicion p=pp.save( new Posicion(nombre));
		return p;
	}
	@RequestMapping(value="/posicion/delete",method=RequestMethod.POST)
	public void deletePosicion(@RequestParam Integer id) {
		Posicion p = pp.getOne(id);
		 pp.delete(p);
	}
	@RequestMapping(value="/posicion/set",method=RequestMethod.POST)
	public Posicion setPosicion(@RequestParam Integer id, String nombre) {
		Posicion p = pp.save(new Posicion(id, nombre));
		return p;
	}
	@RequestMapping(value="/posicion/select",method=RequestMethod.POST)
	public Posicion findPosicion(@RequestParam Integer id) {
		Posicion p = pp.findOne(id);
		return p;
	}
	@RequestMapping(value="/posicion/selectAll",method=RequestMethod.POST)
	public List<Posicion> findAllPosicion() {
		List<Posicion> p = pp.findAll();
		return p;
	}
}