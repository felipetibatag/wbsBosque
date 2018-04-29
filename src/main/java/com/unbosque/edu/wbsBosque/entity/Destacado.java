package com.unbosque.edu.wbsBosque.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="destacado")
public class Destacado {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String nombre;
	private String resena;
	@OneToOne
	private Equipo idEquipo;
	@OneToOne
	private Posicion idPosicion;
	
	public Destacado() {
		
	}
	public Destacado(Integer id) {
		this.id = id;
	}
	public Destacado(String nombre, String resena, Equipo idEquipo, Posicion idPosicion) {
		this.nombre = nombre;
		this.resena = resena;
		this.idEquipo = idEquipo;
		this.idPosicion = idPosicion;
	}
	public Destacado(Integer id, String nombre, String resena, Equipo idEquipo, Posicion idPosicion) {
		this.id = id;
		this.nombre = nombre;
		this.resena = resena;
		this.idEquipo = idEquipo;
		this.idPosicion = idPosicion;
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
	public Equipo getIdEquipo() {
		return idEquipo;
	}
	public void setIdEquipo(Equipo idEquipo) {
		this.idEquipo = idEquipo;
	}
	public Posicion getIdPosicion() {
		return idPosicion;
	}
	public void setIdPosicion(Posicion idPosicion) {
		this.idPosicion = idPosicion;
	}
	
}
