package com.unbosque.edu.wbsBosque.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="partido")
public class Partido {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String fecha;
	@OneToOne
	private Equipo idSeleccion1;
	@OneToOne
	private Equipo idSeleccion2;
	private Integer golesSeleccion1;
	private Integer golesSeleccion2;
	@OneToOne
	private Estadio idEstadio;
	
	public Partido() {
		
	}
	public Partido(Integer id) {
		this.id = id;
	}
	public Partido(String fecha, Equipo idSeleccion1, Equipo idSeleccion2, Integer golesSeleccion1, Integer golesSeleccion2, Estadio idEstadio) {
		this.fecha = fecha;
		this.idSeleccion1 = idSeleccion1;
		this.idSeleccion2 = idSeleccion2;
		this.golesSeleccion1 = golesSeleccion1;
		this.golesSeleccion2 = golesSeleccion2;
		this.idEstadio = idEstadio;
		
	}
	public Partido(Integer id, String fecha, Equipo idSeleccion1, Equipo idSeleccion2, Integer golesSeleccion1, Integer golesSeleccion2, Estadio idEstadio) {
		this.id = id;
		this.fecha = fecha;
		this.idSeleccion1 = idSeleccion1;
		this.idSeleccion2 = idSeleccion2;
		this.golesSeleccion1 = golesSeleccion1;
		this.golesSeleccion2 = golesSeleccion2;
		this.idEstadio = idEstadio;
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Equipo getIdSeleccion1() {
		return idSeleccion1;
	}
	public void setIdSeleccion1(Equipo idSeleccion1) {
		this.idSeleccion1 = idSeleccion1;
	}
	public Equipo getIdSeleccion2() {
		return idSeleccion2;
	}
	public void setIdSeleccion2(Equipo idSeleccion2) {
		this.idSeleccion2 = idSeleccion2;
	}
	public Integer getGolesSeleccion1() {
		return golesSeleccion1;
	}
	public void setGolesSeleccion1(Integer golesSeleccion1) {
		this.golesSeleccion1 = golesSeleccion1;
	}
	public Integer getGolesSeleccion2() {
		return golesSeleccion2;
	}
	public void setGolesSeleccion2(Integer golesSeleccion2) {
		this.golesSeleccion2 = golesSeleccion2;
	}
	public Estadio getIdEstadio() {
		return idEstadio;
	}
	public void setIdEstadio(Estadio idEstadio) {
		this.idEstadio = idEstadio;
	}
	
}
