package application;

import entities.BusinessAccount;

public class Program {

	public static void main (String[] args) {
		
		BusinessAccount account = new BusinessAccount();
		
		//Todos m�todos abaixo da Classe super acessando pela Classe Business Account;
		account.getBalance();
		account.getHolder();
		account.getNumber();

		//M�todo abaixo da Classe Business Account;
				account.getLoanLimit();

		
	}
	
}
