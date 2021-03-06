import java.util.Locale;
import java.util.Scanner;
//Operadores bitwise
//Operador -> Significado
//& -> Opera��o "E" bit a bit
//| -> Opera��o "OU" bit a bit
//^ -> Opera��o "OU-exclusivo" bit a bit

//Tabela &
//C1	C2		C1 e C2
//F		F		F
//F		V		F
//V		F		F
//V		V		V

//Tabela |
//C1	C2		C1 e C2
//F		F		F
//F		V		V
//V		F		V
//V		V		V

//Tabela ^
//C1	C2		C1 e C2
//F		F		F
//F		V		V
//V		F		V
//V		V		F

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int mask = 0b0100000;
		int n = sc.nextInt();

		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		} else {
			System.out.println("6th bit is false!");
		}

		sc.close();
	}
}