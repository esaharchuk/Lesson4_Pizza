package by.htp.lsn.pizza_service;

public class Order {

	public Pizza cookPizza(int name, int size, int dough) {

		Pizza pizza = new Pizza();

		// pizza name
		switch (name) {
		case 1:
			pizza.name = "Caprichosa";
			break;
		case 2:
			pizza.name = "Neapolitana";
			break;
		case 3:
			pizza.name = "4season";
			break;
		case 4:
			pizza.name = "Margarita";
			break;
		}

		// pizza size
		switch (size) {
		case 1:
			pizza.size = 30;
			pizza.price = 8.5;
			break;
		case 2:
			pizza.size = 45;
			pizza.price = 11.5;
			break;

		}

		// pizza dough
		switch (dough) {
		case 1:
			pizza.dough = "Italic";
			break;
		case 2:
			pizza.dough = "American";

		}

		return pizza;

	}

}
