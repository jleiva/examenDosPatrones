package com.cenfotec.pizzeria.entities.extra;

import com.cenfotec.pizzeria.entities.Pizza;

public class PastaDelgada extends DecoradorPizza  {
	Pizza pizza;
	
	public PastaDelgada(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescripcion() + ", pasta delgada";
	}

	@Override
	public double costo() {
		return 1000 + pizza.costo();
	}

}
