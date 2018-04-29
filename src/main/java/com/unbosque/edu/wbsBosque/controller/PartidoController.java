package com.unbosque.edu.wbsBosque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.unbosque.edu.wbsBosque.entity.Equipo;
import com.unbosque.edu.wbsBosque.entity.Estadio;
import com.unbosque.edu.wbsBosque.entity.Partido;
import com.unbosque.edu.wbsBosque.persistence.PartidoPersistence;


@RestController
public class PartidoController {
	
	@Autowired
	PartidoPersistence pp;
	@RequestMapping(value="/partido/add",method=RequestMethod.POST)
	public Partido addPartido(@RequestParam String fecha, Equipo idSeleccion1, Equipo idSeleccion2, Integer golesSeleccion1, Integer golesSeleccion2, Estadio idEstadio){
		Partido p=pp.save( new Partido(fecha, idSeleccion1, idSeleccion2, golesSeleccion1, golesSeleccion2, idEstadio));
		return p;
	}
	@RequestMapping(value="/partido/delete",method=RequestMethod.POST)
	public void deletePartido(@RequestParam Integer id) {
		Partido p = pp.getOne(id);
		 pp.delete(p);
	}
	@RequestMapping(value="/partido/set",method=RequestMethod.POST)
	public Partido setPartido(@RequestParam Integer id, String fecha, Equipo idSeleccion1, Equipo idSeleccion2, Integer golesSeleccion1, Integer golesSeleccion2, Estadio idEstadio) {
		Partido p = pp.save(new Partido(id, fecha, idSeleccion1, idSeleccion2, golesSeleccion1, golesSeleccion2, idEstadio));
		return p;
	}
	@RequestMapping(value="/partido/select",method=RequestMethod.POST)
	public Partido findPartido(@RequestParam Integer id) {
		Partido p = pp.findOne(id);
		//System.out.println(p.toString());
		return p;
	}
	@RequestMapping(value="/partido/selectAll",method=RequestMethod.POST)
	public List<Partido> findAllPartido() {
		List<Partido> p = pp.findAll();
		return p;
	}

}
