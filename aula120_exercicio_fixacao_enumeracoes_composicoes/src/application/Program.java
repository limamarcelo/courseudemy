package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth Date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());

		System.out.println("Enter order data: ");
		Date moment = new Date();
		System.out.print("Status: ");
		sc.nextLine();
		String status = sc.nextLine();

		Order order = new Order((moment), OrderStatus.valueOf(status), new Client(name, email, birthDate));

		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter #" + (i + 1) + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			name = sc.nextLine();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			OrderItem items = new OrderItem(quantity, price, new Product(name, price));
			order.addOrderItem(items);
			System.out.println();

		}

		System.out.println(order);
		System.out.println("Order Items: ");
		for (int i = 0; i < order.getOrderItem().size(); i++) {
			OrderItem product = order.getOrderItem().get(i);
			System.out.printf("%s, %.2f, Quantity: %d, Subtotal: $%.2f%n", product.getProduct().getName(), product.getProduct().getPrice(), product.getQuantity(), product.subTotal());
		}
		
		System.out.print("Total price: $");
		System.out.println(order.total());
		
		sc.close();
	}
}