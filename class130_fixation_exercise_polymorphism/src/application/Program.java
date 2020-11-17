package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProducts;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String name;
		Double price;
		Date manufactureDate;
		Double customsFee;
		List<Product> list = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Product #" + (i + 1) + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);

			while (!(type == 'c' || type == 'u' || type == 'i')) {
				System.out.println("Please try again");
				System.out.print("Common, used or imported (c/u/i)? ");
				type = sc.next().charAt(0);
			}
			if (type == 'c') {
				sc.nextLine();
				System.out.print("Name: ");
				name = sc.nextLine();
				System.out.print("Price: ");
				price = sc.nextDouble();
				list.add(new Product(name, price));
			} else {
				if (type == 'u') {
					sc.nextLine();
					System.out.print("Name: ");
					name = sc.nextLine();
					System.out.print("Price: ");
					price = sc.nextDouble();
					System.out.print("Manufacture date (DD/MM/YYYY): ");
					manufactureDate = sdf.parse(sc.next());
					list.add(new UsedProducts(name, price, manufactureDate));
				} else {
					sc.nextLine();
					System.out.print("Name: ");
					name = sc.nextLine();
					System.out.print("Price: ");
					price = sc.nextDouble();
					System.out.print("Customs fee: ");
					customsFee = sc.nextDouble();
					list.add(new ImportedProduct(name, price, customsFee));
				}
			}
		}
		System.out.println();
		System.out.println("PRICE TAGS: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).priceTag());
		}
		sc.close();
	}
}