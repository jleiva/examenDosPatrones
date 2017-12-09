package com.cenfotec.pizzeria.entities.extra;

import com.cenfotec.pizzeria.entities.Pizza;

public class TamanoMediana extends DecoradorPizza  {
	Pizza pizza;
	
	public TamanoMediana(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescripcion() + ", mediana";
	}

	@Override
	public double costo() {
		return 5000 + pizza.costo();
	}

}
