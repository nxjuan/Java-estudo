package entities;

public class Company extends TaxPayer{
	private Integer numOfEmployees;
	
	public Company() {		
	}

	public Company(String name, Double anualIncome, Integer numOfEmployees) {
		super(name, anualIncome);
		this.numOfEmployees = numOfEmployees;
	}

	public Integer getNumOfEmployees() {
		return numOfEmployees;
	}
	
	@Override
	public Double tax() {
		if(numOfEmployees > 10) {
			return super.getAnualIncome() * 0.14;
		}else {
			return super.getAnualIncome() * 0.16;
		}
	}	
}
