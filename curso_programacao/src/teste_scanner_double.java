
import java.util.Locale;
import java.util.Scanner;

public class teste_scanner_double {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Double x, y;		
		x = sc.nextDouble();		
		System.out.println("Você digitou: " + x);

		y = sc.nextDouble();		
		System.out.printf("Você digitou: %.2f%n", y);
		sc.close();
	}

}
