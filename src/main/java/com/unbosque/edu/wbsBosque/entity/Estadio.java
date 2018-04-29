package com.unbosque.edu.wbsBosque.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="estadio")
public class Estadio {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String nombre;
	private String resena;
	
	public Estadio() {
		
	}
	public Estadio(Integer id) {
		this.id = id;
	}
	public Estadio(String nombre, String resena) {
		this.nombre = nombre;
		this.resena = resena;
	}
	public Estadio(Integer id, String nombre, String resena) {
		this.id = id;
		this.nombre = nombre;
		this.resena = resena;
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
	public String getResena() {
		return resena;
	}
	public void setResena(String resena) {
		this.resena = resena;
	}
	
}
