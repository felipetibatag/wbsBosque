package com.unbosque.edu.wbsBosque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.unbosque.edu.wbsBosque.entity.Estadio;
import com.unbosque.edu.wbsBosque.persistence.EstadioPersistence;

@RestController

public class EstadioController {
	
	@Autowired
	EstadioPersistence pp;
	@RequestMapping(value="/estadio/add",method=RequestMethod.POST)
	public Estadio addEstadio(@RequestParam String nombre, String resena){
		Estadio p=pp.save(new Estadio(nombre, resena));
		return p;
	}
	@RequestMapping(value="/estadio/delete",method=RequestMethod.POST)
	public void deleteEstadio(@RequestParam Integer id) {
		Estadio p = pp.getOne(id);
		 pp.delete(p);		
	}
	@RequestMapping(value="/estadio/set",method=RequestMethod.POST)
	public Estadio setEstadio(@RequestParam Integer id, String nombre, String resena) {
		Estadio p = pp.save(new Estadio(id, nombre, resena));
		return p;
	}
	@RequestMapping(value="/estadio/select",method=RequestMethod.POST)
	public Estadio findEstadio(@RequestParam Integer id) {
		Estadio p = pp.findOne(id);
		return p;
	}
	@RequestMapping(value="/estadio/selectAll",method=RequestMethod.POST)
	public List<Estadio> findAllEstadio() {
		List<Estadio> p = pp.findAll();
		return p;
	}
}
