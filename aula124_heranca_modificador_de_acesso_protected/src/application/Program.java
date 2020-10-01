package application;

import entities.BusinessAccount;

public class Program {

	public static void main (String[] args) {
		
		BusinessAccount account = new BusinessAccount();
		
		//Todos métodos abaixo da Classe super acessando pela Classe Business Account;
		account.getBalance();
		account.getHolder();
		account.getNumber();

		//Método abaixo da Classe Business Account;
				account.getLoanLimit();

		
	}
	
}
