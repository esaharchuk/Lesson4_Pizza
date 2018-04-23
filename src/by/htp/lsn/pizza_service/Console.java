package by.htp.lsn.pizza_service;

import java.util.Scanner;

public class Console {

	Scanner sc = new Scanner(System.in);

	public int pizzaName() {

		System.out.println("Выберите пиццу");

		int name = sc.nextInt();

		return name;
	}

	public int pizzaSize() {

		System.out.println("Выберите размер");

		int size = sc.nextInt();

		return size;
	}

	public int pizzaDough() {

		System.out.println("Выберите тесто");

		int dough = sc.nextInt();

		return dough;
	}

	public String setAddress() {

		System.out.println("Укажите адрес доставки");

		String adress = sc.next();

		return adress;

	}

}
