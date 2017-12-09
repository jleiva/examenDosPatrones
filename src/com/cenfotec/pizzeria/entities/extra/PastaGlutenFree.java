package com.cenfotec.pizzeria.entities.extra;

import com.cenfotec.pizzeria.entities.Pizza;

public class PastaGlutenFree extends DecoradorPizza {
	Pizza pizza;
	
	public PastaGlutenFree(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescripcion() + ", pasta gluten free";
	}

	@Override
	public double costo() {
		return 4000 + pizza.costo();
	}

}
