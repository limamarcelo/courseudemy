import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char resp;
		do 
		{
		System.out.print("Digite a temperatura em Celcius para converter em Fahrenheit: ");
		double C = sc.nextDouble();
		double F = 9*C/5+32;
		System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
		System.out.print("Deseja repetir (s/n)? ");
		resp = sc.next().charAt(0);
		}while(resp != 'n');
			
		sc.close();
	}
}