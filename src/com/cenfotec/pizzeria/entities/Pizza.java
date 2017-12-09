package com.cenfotec.pizzeria.entities;

public abstract class Pizza {
	String descripcion;
    
	public String getDescripcion() {
        return descripcion;
    }
    public abstract double costo();
}
