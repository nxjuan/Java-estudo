package entities;



public class OrderItem {
	private Integer quantity;
	private Double price;
	
	private Products product;
	
	public OrderItem() {
		
	}	

	public OrderItem(Integer quantity, Double price, Products product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}



	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Products getProduct() {
		return product;
	}

	public void setProduct(Products product) {
		this.product = product;
	}


	public Double subTotal() {
		return price * quantity;
	}
	
	@Override
	public String toString() {
		return "Product Name: " 
				+ product.getName() + ",\n"
				+ "Price: $"
				+ price + ",\n" 
				+ "Quantity: "
				+ quantity + ",\n"
				+ "Sub Total: $" + subTotal();
	}
	
}
