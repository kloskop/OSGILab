package pl.edu.agh.iisg.pizzadelivery.impl;

import java.util.Collection;
import java.util.ArrayList;

import pl.edu.agh.iisg.pizzadelivery.IPizzaDelivery;
import pl.edu.agh.iisg.pizzadelivery.Pizza;

public class PizzaChut implements IPizzaDelivery {
	
	Collection pizze;

	public PizzaChut() {
		pizze = new ArrayList();
		Pizza p1 = new Pizza("Margherita", 20);
		Pizza p2 = new Pizza("Funghi", 25);
		Pizza p3 = new Pizza("Parma", 30);
		pizze.add(p1);
		pizze.add(p2);
		pizze.add(p3);
		}
	
	@Override
	public Collection<Pizza> getAllPizzas() {
		// TODO Auto-generated method stub
		return null;
	}

}
