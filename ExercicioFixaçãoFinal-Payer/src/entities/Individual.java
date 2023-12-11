package entities;

public class Individual extends TaxPayer{
	public Double HealthExpenditures;
	
	public Individual() {
		
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		HealthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return HealthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		HealthExpenditures = healthExpenditures;
	}
	
	@Override
	public Double tax() {
		if(super.getAnualIncome() > 20000) {
			return (super.getAnualIncome() * 0.25) - (HealthExpenditures * 0.5);
		}else {
			return(super.getAnualIncome() * 0.15) - (HealthExpenditures * 0.5);
		}
		
	}
}
