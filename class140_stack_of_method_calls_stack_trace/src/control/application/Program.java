package control.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		method1();
		
		System.out.println("End of program");
	}

	public static void method1() {
		System.out.println("******METHOD1 START******");
		method2();
		System.out.println("******METHOD1 END******");
	}
	
	public static void method2() {
		System.out.println("******METHOD2 START******");
		
		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Invalid position");
			//verificar onde est� acontecendo o erro sem o programa terminar com o erro.
			//e.printStackTrace();
			//sc.next();
		} catch (InputMismatchException e) {
			System.err.println("Input error");
		}
		sc.close();
		System.out.println("******METHOD2 END******");

	}
}