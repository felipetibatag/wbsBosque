/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unbosque.edu.wbsBosque.entity;

/**
 *
 * @author F
 */
public class EstadisticaEquipo {
    private String item;
    private Integer total;

    public EstadisticaEquipo() {
    }

    public EstadisticaEquipo(String item, Integer total) {
        this.item = item;
        this.total = total;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
    
    
}
