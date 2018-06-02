package com.unbosque.edu.wbsBosque.entity;

public class Ganadores {
    private Integer id;
    private String nombre;
    private Integer pj;
    private Integer pg;
    private Integer pe;
    private Integer pp;
    private Integer gf;
    private Integer gc;
    private Float suma_t;

    public Ganadores() {
    }

    public Ganadores(Integer id, String nombre, Integer pj, Integer pg, Integer pe, Integer pp, Integer gf, Integer gc, Float suma_t) {
        this.id = id;
        this.nombre = nombre;
        this.pj = pj;
        this.pg = pg;
        this.pe = pe;
        this.pp = pp;
        this.gf = gf;
        this.gc = gc;
        this.suma_t = suma_t;
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

    

    public Integer getPj() {
        return pj;
    }

    public void setPj(Integer pj) {
        this.pj = pj;
    }

    public Integer getPg() {
        return pg;
    }

    public void setPg(Integer pg) {
        this.pg = pg;
    }

    public Integer getPe() {
        return pe;
    }

    public void setPe(Integer pe) {
        this.pe = pe;
    }

    public Integer getPp() {
        return pp;
    }

    public void setPp(Integer pp) {
        this.pp = pp;
    }

    public Integer getGf() {
        return gf;
    }

    public void setGf(Integer gf) {
        this.gf = gf;
    }

    public Integer getGc() {
        return gc;
    }

    public void setGc(Integer gc) {
        this.gc = gc;
    }

    public Float getSuma_t() {
        return suma_t;
    }

    public void setSuma_t(Float suma_t) {
        this.suma_t = suma_t;
    }
}
