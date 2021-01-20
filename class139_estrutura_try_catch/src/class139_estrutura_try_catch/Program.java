package class139_estrutura_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Invalid position");
		}
		catch (InputMismatchException e) {
			System.err.println("Input error");
		}
		
		System.out.println("End of program");
		sc.close();
	}
}