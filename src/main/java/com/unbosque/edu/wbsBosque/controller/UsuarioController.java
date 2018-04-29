package com.unbosque.edu.wbsBosque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.unbosque.edu.wbsBosque.entity.Usuario;
import com.unbosque.edu.wbsBosque.persistence.UsuarioPersistence;

@RestController

public class UsuarioController {
	
	@Autowired
	UsuarioPersistence pp;
	@RequestMapping(value="/usuario/add",method=RequestMethod.POST)
	public Usuario addUsuario(@RequestParam String nombre, String contraseña, String email){
		Usuario p=pp.save( new Usuario(nombre, contraseña, email));
		return p;
	}
	@RequestMapping(value="/usuario/delete",method=RequestMethod.POST)
	public void deleteUsuario(@RequestParam Integer id) {
		Usuario p = pp.getOne(id);
		 pp.delete(p);
	}
	@RequestMapping(value="/usuario/set",method=RequestMethod.POST)
	public Usuario setUsuario(@RequestParam Integer id, String nombre, String contraseña, String email) {
		Usuario p = pp.save(new Usuario(id, nombre, contraseña, email));
		return p;
	}
	@RequestMapping(value="/usuario/select",method=RequestMethod.POST)
	public Usuario findUsuario(@RequestParam Integer id) {
		Usuario p = pp.findOne(id);
		//System.out.println(p.toString());
		return p;
	}
	@RequestMapping(value="/usuario/selectAll",method=RequestMethod.POST)
	public List<Usuario> findAllUsuario() {
		List<Usuario> p = pp.findAll();
		return p;
	}
}