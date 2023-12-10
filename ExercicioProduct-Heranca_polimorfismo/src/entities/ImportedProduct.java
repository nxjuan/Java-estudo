package entities;

public class ImportedProduct extends Product{
	private Double customFee;
	
	public ImportedProduct() {}

	public ImportedProduct(String name, Double price, Double customFree) {
		super(name, price);
		this.customFee = customFree;
	}

	public Double getCustomFree() {
		return customFee;
	}

	public void setCustomFree(Double customFree) {
		this.customFee = customFree;
	}
	
	@Override
	public String priceTag() {
		return super.getName() 
				+ " $" 
				+ (super.getPrice() + customFee)
				+ " (Customs fee: $" 
				+ customFee 
				+ ")"; 
	}
}
