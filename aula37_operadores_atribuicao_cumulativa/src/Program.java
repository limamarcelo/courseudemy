import java.util.Locale;
import java.util.Scanner; //CTRL + SHIFT + O - para importar as classes

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Double minutos;
		Double conta = 50.0;
		System.out.println("Informe a quantidade de minutos");
		minutos = sc.nextDouble();
		if (minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}
		System.out.printf("Valor a pagar: R$%.2f%n ", conta);

		sc.close();
	}

}
