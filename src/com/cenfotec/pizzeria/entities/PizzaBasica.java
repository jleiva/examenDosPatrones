package com.cenfotec.pizzeria.entities;

public class PizzaBasica extends Pizza {
	
	public PizzaBasica(){
        descripcion = "Pizza basica";
    }
	
	@Override
	public double costo() {
		return 0;
	}
}
