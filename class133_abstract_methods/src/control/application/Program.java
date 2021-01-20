package control.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.circle.Circle;
import model.entities.enums.Color;
import model.entities.rectangle.Rectangle;
import model.entities.shape.Shape;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Shape> list = new ArrayList<>();

		System.out.print("Enter the number of shapes: ");
		int n = Integer.parseInt(sc.next());
		for (int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			if (ch == 'r') {
				System.out.print("Width: ");
				double width = Double.parseDouble(sc.next());
				System.out.print("Heigth: ");
				double heigth = Double.parseDouble(sc.next());
				list.add(new Rectangle(color, width, heigth));
				System.out.println();
			} else {
				System.out.print("Radius: ");
				double radius = Double.parseDouble(sc.next());
				list.add(new Circle(color, radius));
				System.out.println();
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		sc.close();
	}
}