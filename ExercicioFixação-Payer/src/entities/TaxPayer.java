package entities;

public abstract class TaxPayer {
	private String name;
	private Double anualIncome;
	
	public TaxPayer() {}

	public TaxPayer(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public abstract Double tax();
}
