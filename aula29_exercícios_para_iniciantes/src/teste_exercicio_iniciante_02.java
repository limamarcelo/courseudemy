import java.util.Locale;
import java.util.Scanner; //CTRL + SHIFT + O - para importar as classes

public class teste_exercicio_iniciante_02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Cálculo área:");
		System.out.println("Digite o valor do raio: ");
		Double R, A, pi = 3.14159;
		R = sc.nextDouble();
		A = pi * R * R;
		System.out.printf("O valor da área é de %.4f%n", A);
		sc.close();
	}

}
