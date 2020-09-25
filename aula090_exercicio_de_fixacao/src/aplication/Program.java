package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Quartos;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Quartos[] quartos = new Quartos[10];

		System.out.println("Quantos alunos para registrar? (0-10)");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Aluguel: #" + (i + 1));
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int numero = sc.nextInt();
			quartos[numero] = new Quartos(numero, nome, email);
		}
		System.out.println("Quartos ocupados:");
		for (int i = 0; i < quartos.length; i++) {
			if (quartos[i] != null) {
				System.out.println(quartos[i]);

			}
		}
		sc.close();
	}
}
