package com.cenfotec.examen.pizzeria.builder;

import com.cenfotec.examen.pizzeria.entities.Pizza;
import com.cenfotec.examen.pizzeria.enums.Pasta;
import com.cenfotec.examen.pizzeria.enums.Queso;
import com.cenfotec.examen.pizzeria.enums.Tamano;
import com.cenfotec.examen.pizzeria.enums.Topping;

public class PizzaBuilder {	
	Pizza pizza = new Pizza();
	
	public PizzaBuilder(Tamano tamano) {
		pizza.setTamano(tamano);
        pizza.agregarCosto(tamano.getCosto());
    }
	 
    public PizzaBuilder withTopping(Topping topping) {
        pizza.setTopping(topping);
        pizza.agregarCosto(topping.getCosto());
        return this;
    }
    
    public PizzaBuilder withVegetal(String vegetal) {
        pizza.setVegetal(vegetal);
        pizza.agregarCosto(100);
        return this;
    }
 
    public PizzaBuilder withPasta(Pasta pasta) {
        pizza.setPasta(pasta);
        pizza.agregarCosto(pasta.getCosto());
        return this;
    }
    
    public PizzaBuilder salsa(String salsa) {
        pizza.setSalsa(salsa);
        return this;
    }
    
    public PizzaBuilder withQueso(Queso queso) {
        pizza.setQueso(queso);
        pizza.agregarCosto(queso.getCosto());
        return this;
    }
    
    public PizzaBuilder withExtraQueso(boolean hasExtraQueso) {
    		pizza.setExtraQueso(hasExtraQueso);
    		pizza.agregarCosto(1000);
        return this;
    }
 
    public Pizza build() {
        return pizza;
    }
 
    public double calcularPrecio() {
        return pizza.getPrecio();
    }
}
