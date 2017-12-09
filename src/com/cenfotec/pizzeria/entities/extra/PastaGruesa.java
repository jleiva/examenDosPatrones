package com.cenfotec.pizzeria.entities.extra;

import com.cenfotec.pizzeria.entities.Pizza;

public class PastaGruesa extends DecoradorPizza {
	Pizza pizza;
	
	public PastaGruesa(Pizza pizza) {
		this.pizza = pizza;
	}
	@Override
	public String getDescription() {
		return pizza.getDescripcion() + ", pasta gruesa";
	}

	@Override
	public double costo() {
		return 4000 + pizza.costo();
	}

}
