package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Alex", 0.00);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.00, 500.00);

		// UPCASTING
		/*
		 * pegar um objeto do tipo BusinessAccount
		 * e atribuir para uma vari�vel do tipo
		 * Account;
		 * N�o gera erro porque uma BusinessAccount � uma Account
		 * Uma conta Empresarial tamb�m � uma Conta;
		 * acc1 = bacc
		 */
		Account acc1 = bacc;
		acc1.getBalance();
		
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

		// DOWNCASTING

		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);

		/*
		 * D� um erro abaixo pelo seguinte motivo, a acc5 � uma Business Account que
		 * est� abaixo da Account e ao lado da SavingsAccount, portanto o sistema n�o
		 * entende que ela n�o pode fazer Downcasting; Na hora de fazer um Downcasting
		 * nem sepre vai dar certo; O compilador n�o sabe disso e depende muito do
		 * programador para ele n�o deixar isso acontecer;
		 */
		// BusinessAccount acc5 = (BusinessAccount) acc3;

		// Para evitar eu preciso testar se acc3 � do tipo BusinessAccount e se for
		// posso fazer a convers�o para acc5;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}
}