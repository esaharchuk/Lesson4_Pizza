package by.htp.lsn.pizza_service;

import java.util.Scanner;

public class Console {

	public class Input {

		Scanner sc = new Scanner(System.in);

		public String pizzaName() {

			System.out.println("�������� �����");

			String name = sc.next();

			return name;
		}
		
		public int pizzaSize() {
			
			System.out.println("�������� ������");
			
			int size = sc.nextInt();
			
			return size;
		}
		
		public String pizzaDough() {
			
			System.out.println("�������� �����");
			
			String dough = sc.next();
			
			return dough;
		}

	}
}
