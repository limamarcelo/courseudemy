import java.util.Locale;
import java.util.Scanner; //CTRL + SHIFT + O - para importar as classes

public class teste_exercicio_iniciante_04 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int hora;
		System.out.println("Que horas são?");
		hora = sc.nextInt();
		if (hora < 12) {
			System.out.println("Bom dia!");
		} else if (hora < 18) {
			System.out.println("Boa tarde!");
		} else {
			System.out.println("Boa noite!");
		}
		sc.close();
	}

}
