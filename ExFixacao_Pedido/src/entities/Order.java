/**
 * 
 */
package entities;

import java.time.LocalDate;

import entities.enums.OrderStatus;

/**
 * 
 */
public class Order {
	private LocalDate moment;
	private OrderStatus status;
	
	public Order() {
		
	}

	public Order(LocalDate moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}

	public LocalDate getMoment() {
		return moment;
	}

	public void setMoment(LocalDate moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public void addItem(OrderItem item) {
		
	}
	
	public void removeItem(OrderItem item) {
		
	}
	public Double total() {
		return 1.0;
	}
}
