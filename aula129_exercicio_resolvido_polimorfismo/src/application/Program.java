package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> employees = new ArrayList<>();

		String name;
		Integer hours;
		Double valuePerHour;
		Double additionalCharge;

		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i + 1) + " data:");
			System.out.print("Outsourced (y/n)? ");
			char res = sc.next().charAt(0);
			sc.nextLine();
			while (!(res == 'y' || res == 'n')) {
				System.out.println("Please try again");
				System.out.print("Outsourced (y/n)? ");
				res = sc.next().charAt(0);
			}
			if (res == 'n') {
				System.out.print("Name: ");
				name = sc.nextLine();
				System.out.print("Hours: ");
				hours = sc.nextInt();
				sc.nextLine();
				System.out.print("Value per hour: ");
				valuePerHour = sc.nextDouble();

				Employee employee = new Employee(name, hours, valuePerHour);
				employees.add(employee);
			}
			if (res == 'y') {
				System.out.print("Name: ");
				name = sc.nextLine();
				System.out.print("Hours: ");
				hours = sc.nextInt();
				sc.nextLine();
				System.out.print("Value per hour: ");
				valuePerHour = sc.nextDouble();
				System.out.print("Additional charge: ");
				additionalCharge = sc.nextDouble();

				Employee employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				employees.add(employee);
			}
		}
		System.out.println();
		System.out.println("PAYMENTS:");
		for (int i = 0; i < employees.size(); i++) {
			System.out.println(employees.get(i).getName() + " - $" + String.format("%.2f", employees.get(i).payment()));
		}
		sc.close();
	}
}