package com.cenfotec.examen.pizzeria.entities;

import java.util.ArrayList;
import java.util.Collection;

import com.cenfotec.examen.pizzeria.enums.Pasta;
import com.cenfotec.examen.pizzeria.enums.Queso;
import com.cenfotec.examen.pizzeria.enums.Tamano;
import com.cenfotec.examen.pizzeria.enums.Topping;

public class Pizza {
	private float precio = 0;
	private Pasta pasta;
    private String salsa;
    private Topping topping;
    private Tamano tamano;
    private boolean hasExtraQueso;
    private Collection<String> vegetales = new ArrayList<>();
	private Queso queso;

    public void setPasta(Pasta pasta) {
        this.pasta = pasta;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public void setTopping(Topping topping) {
        this.topping = topping;
    }
    
    public void setTamano(Tamano tamano) {
		this.tamano = tamano;
	}
    
    public void setExtraQueso(boolean hasExtraQueso) {
		this.hasExtraQueso = hasExtraQueso;
	}
    
    public float getPrecio() {
        return this.precio;
    }
    
    public void agregarCosto(float costo) {
        this.precio = precio + costo;
    }

	public void setVegetal(String vegetal) {
		this.vegetales.add(vegetal);
	}

	public void setQueso(Queso queso) {
		this.queso = queso;
	}
}
