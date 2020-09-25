package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private Date moment;
	private OrderStatus status;
	private Client client;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private List<OrderItem> items = new ArrayList<>();

	public Order() {

	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.items = new ArrayList<>();
		this.client = client;
	}

	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return this.status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getOrderItem() {
		return this.items;
	}

	public void addOrderItem(OrderItem items) {
		this.items.add(items);
	}

	public void removeOrderItem(OrderItem items) {
		this.items.remove(items);
	}

	public double total() {
		double sum = 0;
		OrderItem order = null;
		for (int i = 0; i < items.size(); i++) {
			order = items.get(i);
			sum += order.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
		return "ORDER SUMMARY:\n"
				+ "Order moment: "
				+ sdf.format(this.moment)
				+ "\nOrder status: "
				+ this.status;
	}
}
