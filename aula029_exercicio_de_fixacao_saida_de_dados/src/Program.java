import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";

		int age = 31;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.printf("Products: %n%s wich price is $ %.2f %n%s, whice price is $ %.2f %n", product1, price1,
				product2, price2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %s%n", age, code, gender);
		System.out.println();
		System.out.printf("Measure with eight decimal places: %f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
		// marcadores
		// (%d para int)
		// (%s para texto)
		// (%f casas ap�s a v�rgula)
		// (%n para quebra de p�gina)

	}

}
