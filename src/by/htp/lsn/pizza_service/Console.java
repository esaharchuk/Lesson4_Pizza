package by.htp.lsn.pizza_service;

import java.util.Scanner;

public class Console {

	Scanner sc = new Scanner(System.in);

	public int pizzaName() {

		System.out.println("�������� �����");

		int name = sc.nextInt();

		return name;
	}

	public int pizzaSize() {

		System.out.println("�������� ������");

		int size = sc.nextInt();

		return size;
	}

	public int pizzaDough() {

		System.out.println("�������� �����");

		int dough = sc.nextInt();

		return dough;
	}

	public String setAddress() {

		System.out.println("������� ����� ��������");

		String adress = sc.next();

		return adress;

	}

}
