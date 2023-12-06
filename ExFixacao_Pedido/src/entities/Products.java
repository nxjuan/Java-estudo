package entities;

public class Products {
	private String name;
	private Double price;
	
	public Products(){
		
	}

	public Products(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

}
