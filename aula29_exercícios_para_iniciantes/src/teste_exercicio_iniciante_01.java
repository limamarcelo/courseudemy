import java.util.Locale;
import java.util.Scanner; //CTRL + SHIFT + O - para importar as classes

public class teste_exercicio_iniciante_01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Soma entre dois valores");
		
		System.out.println("Digite o primeiro valor: ");
		int valor1 = sc.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		int valor2 = sc.nextInt();

		int soma = valor1+valor2;
		System.out.println("SOMA : " + soma);
		
		sc.close();
	}

}