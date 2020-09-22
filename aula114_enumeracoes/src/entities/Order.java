package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class Order {

	private Integer id;
	private Date moment;
	private OrderStatus status;
	
	public Order() {
		
	}
	
	public Order(Integer id, Date moment, OrderStatus status) {
	setId(id);
	setMoment(moment);
	setStatus(status);
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}
	
	public Date getMoment() {
		return moment;
	}
	
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public OrderStatus getOrderStatus() {
		return status;
	}
	
	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
}
