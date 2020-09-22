package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		System.out.println(order);
		
		//String para enum - usuário preencher num formulário e converter para uma instância
		OrderStatus os1 = OrderStatus.DELIVERED;
		//Utilizando o valueOf faz esta conversão do String informado pelo usuário para a instância.
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		System.out.println(os1);
		System.out.println(os2);
		
	}

}
