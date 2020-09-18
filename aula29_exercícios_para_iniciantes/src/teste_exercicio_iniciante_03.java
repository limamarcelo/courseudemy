import java.util.Locale;
import java.util.Scanner; //CTRL + SHIFT + O - para importar as classes

public class teste_exercicio_iniciante_03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Diferença do produto entre A e B pelo produto de C e D");
		Double A, B, C, D, Dif;
		System.out.println("Digite o valor de A: ");
		A = sc.nextDouble();
		System.out.println("Digite o valor de B: ");
		B = sc.nextDouble();
		System.out.println("Digite o valor de C: ");
		C = sc.nextDouble();
		System.out.println("Digite o valor de D: ");
		D = sc.nextDouble();
		
		Dif = (A * B - C * D);
		
		System.out.println("A diferença dos produtos é: " + Dif);
		sc.close();
	}

}
