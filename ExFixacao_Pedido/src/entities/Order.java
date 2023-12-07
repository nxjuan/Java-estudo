/**
 * 
 */
package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private LocalDateTime moment;
	private OrderStatus status;
	
	private Client client;
	
	private List<OrderItem> items = new ArrayList<>();
	
	public Order() {
		
	}	
	
	public Order(LocalDateTime moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {	
		items.remove(item);
	}
	public Double total() {
		Double sum = 0.0;
		for (OrderItem it : items) {
			sum += it.subTotal();
		}
		return sum;
	}
	@Override
	public String toString() {
		DateTimeFormatter dtft = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyy");
		StringBuilder sb = new StringBuilder();
		
		sb.append("ORDER SUMMARY: \n");
		sb.append("Order moment: " + dtft.format(moment));
		sb.append("\nOrder status: " + status);
		sb.append("\nClient: " + client.getName() + " (" + client.getBirthDate().format(dtf)+ ") - " + client.getEmail());
		sb.append("\nOrder items:\n");
		for (OrderItem item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $" + total());
		return sb.toString();
	}
}
