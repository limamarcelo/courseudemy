import java.util.Locale;
import java.util.Scanner; //CTRL + SHIFT + O - para importar as classes

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Double valor;
		System.out.println("Digite o valor para calcular o desconto");
		valor = sc.nextDouble();

		Double desconto = (valor < 20) ? valor * 0.1 : valor * 0.05;
		System.out.println("Valor do desconto � de " + desconto);

		// if (valor < 20) {
		// desconto = valor * 0.1;

		// } else {
		// desconto = valor * 0.05;
		// }
		// System.out.println("Valor do desconto � de " + desconto);
		sc.close();
	}

}
