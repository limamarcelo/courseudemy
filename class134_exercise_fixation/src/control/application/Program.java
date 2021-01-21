package control.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.taxpayer.TaxPayer;
import model.entities.taxpayer.company.Company;
import model.entities.taxpayer.individual.Individual;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List<TaxPayer> list = new ArrayList<TaxPayer>();

		System.out.print("Enter the number of tax payers: ");
		int n = Integer.parseInt(sc.next());
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Annual income: ");
			Double annualIncome = Double.parseDouble(sc.next());
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = Double.parseDouble(sc.next());
				list.add(new Individual(name, annualIncome, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = Integer.parseInt(sc.next());
				list.add(new Company(name, annualIncome, numberOfEmployees));
			}
		}

		System.out.println();
		System.out.println("TAXES PAID:");
		for (TaxPayer tp : list) {
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax()));
		}

		double sum = 0.00;
		for (TaxPayer tp : list) {
			sum += tp.tax();
		}

		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		sc.close();
	}
}