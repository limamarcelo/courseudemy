package control.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.person.Person;
import entities.person.legal.LegalPerson;
import entities.person.physical.PhysicalPerson;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List<Person> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = Integer.parseInt(sc.next());
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			Double annualIncome = Double.parseDouble(sc.next());
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				Double healthSpending = Double.parseDouble(sc.next());
				list.add(new PhysicalPerson(name, annualIncome, healthSpending));
			} else {
				System.out.print("Number of employees: ");
				int employeesNumber = Integer.parseInt(sc.next());
				list.add(new LegalPerson(name, annualIncome, employeesNumber));
			}
		}
		System.out.println("TAXES PAID:");
		Double totalTaxes = 0.00;
		for (Person person : list) {
			System.out.println(person.getName() + ": $ " + String.format("%.2f", person.tax()));
			totalTaxes += person.tax();
		}
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totalTaxes));
		sc.close();
	}
}