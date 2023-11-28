package Entities;

public class Product {
	private String name;
	private double price;
	private int quantity;
	
	//Construtores
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	/*Encapsulamentos*/
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	//-------
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
				//não vamos colocar o setQuantity pq não queremos que a quantidade em estoque seja 
				//alterada, a não ser durante as funções abaixo: addProducts e removeProducts
	
	//Funções

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", " 
				+ quantity 
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}