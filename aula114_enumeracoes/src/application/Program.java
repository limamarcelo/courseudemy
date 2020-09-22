package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		System.out.println(order);
		
		//String para enum - usu�rio preencher num formul�rio e converter para uma inst�ncia
		OrderStatus os1 = OrderStatus.DELIVERED;
		//Utilizando o valueOf faz esta convers�o do String informado pelo usu�rio para a inst�ncia.
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		System.out.println(os1);
		System.out.println(os2);
		
	}

}
