package aula70_membros_estáticos_parte1;

import java.util.Locale;
import java.util.Scanner;

public class versao_1_marcelo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		double circumference = radius * 2 * Math.PI;
		System.out.printf("Circumference: %.2f%n", circumference);
		double volume = Math.PI * Math.pow(radius, 3) * 4 / 3;
		System.out.printf("Volume: %.2f%n", volume);

		System.out.printf("PI value: %.2f%n", Math.PI);

		sc.close();
	}
}
