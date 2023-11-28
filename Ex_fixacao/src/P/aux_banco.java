package P;

public class aux_banco {
	private String Holder;
	private int Number;
	private double Value;	
	//=============CONSTRUCTORS===============
	public aux_banco(String holder, int number) {
		Holder = holder;
		Number = number;
	}
	
	
	public aux_banco(String holder, int number, double initialvalue) {
		Holder = holder;
		Number = number;
		deposit(initialvalue);
	}
	//===========GETTERS AND SETTERS===========
	public String getHolder() {
		return Holder;
	}
	public void setHolder(String holder) {
		Holder = holder;
	}
	public int getNumber() {
		return Number;
	}

	public double getValue() {
		return Value;
	}
	//===========METHODS======================
	public void deposit(double amount) {
		Value += amount;
	}
	public void withdraw(double amount) {
		Value -= amount + 5;
	}
	
	public String toString() {
		return "Account: "
				+ Number
				+ ", Holder: "
				+ Holder
				+ ", Balance: $"
				+ String.format("%.2f", Value); 
	}
}
