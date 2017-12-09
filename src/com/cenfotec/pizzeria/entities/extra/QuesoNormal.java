package com.cenfotec.pizzeria.entities.extra;

import com.cenfotec.pizzeria.entities.Pizza;

public class QuesoNormal extends DecoradorPizza  {
	Pizza pizza;
	
	public QuesoNormal(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescripcion() + ", queso normal";
	}

	@Override
	public double costo() {
		return 500 + pizza.costo();
	}

}
