package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProducts extends Product{
	
	DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public LocalDate manufactureDate;
	
	public UsedProducts() {}

	public UsedProducts(String name, Double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return super.getName() 
				+ " (Used) $" 	
				+ super.getPrice()
				+ " (Manufacture Date: "
				+ manufactureDate.format(df)
				+ ")"; 
		
		
	}	
}
