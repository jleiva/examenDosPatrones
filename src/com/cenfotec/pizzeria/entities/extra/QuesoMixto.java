package com.cenfotec.pizzeria.entities.extra;

import com.cenfotec.pizzeria.entities.Pizza;

public class QuesoMixto extends DecoradorPizza  {
	Pizza pizza;
	
	public QuesoMixto(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescripcion() + ", queso mixto";
	}

	@Override
	public double costo() {
		return 1500 + pizza.costo();
	}

}
