package com.cenfotec.examen;

import com.cenfotec.examen.pizzeria.builder.PizzaBuilder;
import com.cenfotec.examen.pizzeria.entities.Pizza;
import com.cenfotec.examen.pizzeria.enums.Pasta;
import com.cenfotec.examen.pizzeria.enums.Queso;
import com.cenfotec.examen.pizzeria.enums.Tamano;
import com.cenfotec.examen.pizzeria.enums.Topping;

public class ExamenDos {
	public static void main(String[] args) {
		Pizza pizzaPersonal = new PizzaBuilder(Tamano.PEQUENA)
				.withPasta(Pasta.DELGADA)
				.salsa("tomate")
				.withQueso(Queso.MOZZARELLA)
				.withExtraQueso(true)
				.withVegetal("Tomate")
				.withVegetal("Chile")
				.withVegetal("Cebolla")
				.withTopping(Topping.JAMON)
				.withTopping(Topping.TOCINETA)
				.build();
		
		System.out.println(pizzaPersonal.getPrecio());
		
		Pizza pizzaHipster = new PizzaBuilder(Tamano.PEQUENA)
				.withPasta(Pasta.GLUTEN_FREE)
				.salsa("tomate")
				.withQueso(Queso.MOZZARELLA)
				.build();
		
		System.out.println(pizzaHipster.getPrecio());
	}
}
