
import java.util.Scanner;

public class teste_scanner_int {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;		
		x = sc.nextInt();		
		System.out.println("Voc� digitou: " + x);
		sc.close();
	}

}
