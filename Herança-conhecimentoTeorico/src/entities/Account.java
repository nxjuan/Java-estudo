package entities;

public class Account {
	private Integer number;
	protected Double balance;
	private String holder;
	
	public Account() {
		
	}

	public Account(Integer number, Double balance, String holder) {
		this.number = number;
		this.balance = balance;
		this.holder = holder;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Double getBalance() {
		return balance;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
}
