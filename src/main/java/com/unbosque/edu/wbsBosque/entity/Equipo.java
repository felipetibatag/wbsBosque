package com.unbosque.edu.wbsBosque.entity;

import javax.persistence.*;

@Entity
@Table(name="equipo")
public class Equipo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String nombre;	
	private String grupo;
	private String resena;
	private String cod_pais;
	
	public Equipo() {
		
	}
	public Equipo(Integer id) {
		this.id = id;
	}
	public Equipo(String nombre, String grupo, String resena, String cod_pais) {
		this.nombre = nombre;
		this.grupo = grupo;
		this.resena = resena;
		this.cod_pais = cod_pais;
	}
	public Equipo(Integer id, String nombre, String grupo, String resena, String cod_pais) {
		this.id = id;
		this.nombre = nombre;
		this.grupo = grupo;
		this.resena = resena;
		this.cod_pais = cod_pais;
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
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public String getResena() {
		return resena;
	}
	public void setReseña(String resena) {
		this.resena = resena;
	}
	public String getCod_pais() {
		return cod_pais;
	}
	public void setCod_pais(String cod_pais) {
		this.cod_pais = cod_pais;
	}
		
}
