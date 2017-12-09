package com.cenfotec.pizzeria.entities.extra;

import com.cenfotec.pizzeria.entities.Pizza;

public class PastaNormal extends DecoradorPizza {
	Pizza pizza;
	
	public PastaNormal(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescripcion() + ", pasta normal";
	}

	@Override
	public double costo() {
		return 2000 + pizza.costo();
	}
}
