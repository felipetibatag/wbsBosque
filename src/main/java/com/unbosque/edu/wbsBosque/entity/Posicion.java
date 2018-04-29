package com.unbosque.edu.wbsBosque.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="posicion")
public class Posicion {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String nombre;
	
	public Posicion() {
	}
	public Posicion(Integer id) {
		this.id = id;
	}
	public Posicion(String nombre) {
		this.nombre = nombre;
	}
	public Posicion(Integer id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
