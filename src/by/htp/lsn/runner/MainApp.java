package by.htp.lsn.runner;

import by.htp.lsn.pizza_service.Console;
import by.htp.lsn.pizza_service.Order;
import by.htp.lsn.pizza_service.Pizza;

public class MainApp {

	public static void main(String[] args) {

		Pizza pizza1 = new Pizza();
		Order ord = new Order();
		Console input = new Console();

		int pizzaName = input.pizzaName();
		int pizzaSize = input.pizzaSize();
		int pizzaDough = input.pizzaDough();
		String setAddress = input.setAddress();

		pizza1 = ord.cookPizza(pizzaName, pizzaSize, pizzaDough);

		setAddress.length();

	}
}