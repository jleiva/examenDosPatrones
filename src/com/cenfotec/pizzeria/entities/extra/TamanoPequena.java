package com.cenfotec.pizzeria.entities.extra;

import com.cenfotec.pizzeria.entities.Pizza;

	public class TamanoPequena extends DecoradorPizza  {
	Pizza pizza;
	
	public TamanoPequena(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescripcion() + ", pequeña";
	}

	@Override
	public double costo() {
		return 2000 + pizza.costo();
	}

}
