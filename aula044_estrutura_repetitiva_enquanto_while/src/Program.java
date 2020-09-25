import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um novo valor");
		int soma = 0;
		int x = sc.nextInt();
		while (x != 0) {
			soma += x;
			x = sc.nextInt();
			
		}
		System.out.println("A soma dos valores tentados foram: " + soma);

		sc.close();
	}
}
