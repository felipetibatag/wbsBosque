package com.unbosque.edu.wbsBosque.entity;

public class EstadisticaGeneral {
    private Integer id;
    private String nombre;
    private String cod_pais;
    private Integer pj;
    private Integer pg;
    private Integer pe;
    private Integer pp;
    private Integer gf;
    private Integer gc;
    private Float rendimiento;

    public EstadisticaGeneral() {
    }

    public EstadisticaGeneral(Integer id, String nombre, String cod_pais, Integer pj, Integer pg, Integer pe, Integer pp, Integer gf, Integer gc, Float rendimiento) {
        this.id = id;
        this.nombre = nombre;
        this.cod_pais = cod_pais;
        this.pj = pj;
        this.pg = pg;
        this.pe = pe;
        this.pp = pp;
        this.gf = gf;
        this.gc = gc;
        this.rendimiento = rendimiento;
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

    public String getCod_pais() {
        return cod_pais;
    }

    public void setCod_pais(String cod_pais) {
        this.cod_pais = cod_pais;
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

    public Float getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(Float rendimiento) {
        this.rendimiento = rendimiento;
    }
}
