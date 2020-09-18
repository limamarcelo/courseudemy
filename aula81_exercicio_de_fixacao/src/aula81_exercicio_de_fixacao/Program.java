package aula81_exercicio_de_fixacao;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		ContaBancaria contaBancaria;

		System.out.print("Enter account number: ");
		int numeroConta = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nomeTitular = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)?");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double depositoInicial = sc.nextDouble();
			contaBancaria = new ContaBancaria(numeroConta, nomeTitular, depositoInicial);
		} else {
			contaBancaria = new ContaBancaria(numeroConta, nomeTitular);
		}

		System.out.println();
		System.out.println("Account data:");
		System.out.println(contaBancaria);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposito = sc.nextDouble();
		contaBancaria.deposito(deposito);
		System.out.println("Updated account data:");
		System.out.println(contaBancaria);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double saque = sc.nextDouble();
		contaBancaria.saque(saque);
		System.out.println("Updated account data: ");
		System.out.println(contaBancaria);

		sc.close();
	}
}