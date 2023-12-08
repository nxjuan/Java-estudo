package programs;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Aplication {

	public static void main(String[] args) {
		Account acc = new Account(1001, 100.0, "Juan" );
		BusinessAccount bacc = new BusinessAccount(1002, 0.0, "Victor", 500.0);
		
		// UPCASTING
		
			// consegue suportar objetos derivados 
		Account acc0 = acc; 
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, 0.0, "Nogueira", 100.0);		
		Account acc3 = new SavingsAccount(1003, 200.0, "Arran Kaku", 0.1);
		
		//DOWNCASTING
		
			// consegue receber outros objetos da mesma subclasse 
			// realizando casting manual \|/
		BusinessAccount acc4 = (BusinessAccount)acc2;
		
			// para o caso de não saber se é da mesma subclasse
			// usamos a palavra instanceof		
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.deposit(500.0);
			System.out.println("Deposited!");
		}
		
	}

}
