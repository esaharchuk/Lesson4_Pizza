package by.htp.lsn.runner;

import by.htp.pizza.pizzaservice.Pizza;
import by.htp.pizza.pizzaservice.PizzaHouse;

public class MainApp {

	public static void main(String[] args) {
		
		
		char[] title1;
		Pizza pizza = new Pizza();
		System.out.println(title1);
		
		
		Pizza pizza2 = new Pizza();
		pizza.size = 42;
		pizza.title = "Italy";
		
		Pizza pizza3 = new Pizza();
		pizza.size = 36;
		pizza.title = "Margarita";


		PizzaHouse house = new PizzaHouse();
		Pizza pizza3 = house.cookPizza();
		
		System.out.println();
		
		//Ask for pizza
		
		// Cook pizza
		
		// Deliver pizza

	}

}