package entities;

public class BusinessAccount extends Account{
	private Double loanLimit;
	
	public BusinessAccount() {
		
	}

	public BusinessAccount(Integer number, Double balance, String holder, Double loanLimit) {
		super(number, balance, holder);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if(amount <= loanLimit) {
			balance += amount - 10.0;
		}		
	}
}
