package com.cenfotec.examen;

import com.cenfotec.pizzeria.entities.Pizza;
import com.cenfotec.pizzeria.entities.PizzaBasica;
import com.cenfotec.pizzeria.entities.extra.PastaDelgada;
import com.cenfotec.pizzeria.entities.extra.PastaGlutenFree;
import com.cenfotec.pizzeria.entities.extra.QuesoMozzarella;
import com.cenfotec.pizzeria.entities.extra.TamanoPequena;

public class ExamenDos {
	public static void main(String[] args) {
		Pizza pizzaDecorada = new PizzaBasica();
		
		pizzaDecorada = new PastaDelgada(pizzaDecorada);
		pizzaDecorada = new TamanoPequena(pizzaDecorada);
		pizzaDecorada = new QuesoMozzarella(pizzaDecorada);
		
		System.out.println(pizzaDecorada.costo());
		
		
		Pizza pizzaHipster = new PizzaBasica();
		pizzaHipster = new PastaGlutenFree(pizzaHipster);
		pizzaHipster = new QuesoMozzarella(pizzaHipster);
		System.out.println(pizzaHipster.costo());

	}
}
