package com.cenfotec.pizzeria.entities.extra;

import com.cenfotec.pizzeria.entities.Pizza;

public class QuesoMozzarella extends DecoradorPizza  {
	Pizza pizza;
	
	public QuesoMozzarella(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescripcion() + ", queso mozzarella";
	}

	@Override
	public double costo() {
		return 2000 + pizza.costo();
	}

}
