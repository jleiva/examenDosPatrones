package com.cenfotec.pizzeria.entities.extra;

import com.cenfotec.pizzeria.entities.Pizza;

	public class TamanoGrande extends DecoradorPizza  {
	Pizza pizza;
	
	public TamanoGrande(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescripcion() + ", grande";
	}

	@Override
	public double costo() {
		return 8000 + pizza.costo();
	}

}
