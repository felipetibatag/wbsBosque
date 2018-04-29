package com.unbosque.edu.wbsBosque.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String nombre;
	private String contraseña;
	private String email;
	
	public Usuario() {
		
	}
	public Usuario(Integer id) {
		this.id = id;
	}
	public Usuario(String nombre, String contraseña, String email){
		this.nombre = nombre;
		this.contraseña = contraseña;
		this.email = email;
	}
	public Usuario(Integer id, String nombre, String contraseña, String email) {
		this.id = id;
		this.nombre = nombre;
		this.contraseña = contraseña;
		this.email = email;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
