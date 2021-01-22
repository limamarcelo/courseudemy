package control.application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		File file = new File(
				"C:\\Users\\miran\\OneDrive\\Cursos Udemy\\Java COMPLETO 2020 Programação Orientada a Objetos +Projetos\\Seção 15 - Tratamento de exceções\\141. Bloco finally\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.err.println("Error opening file: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
			System.out.println("Finally block executed");
		}
	}
}