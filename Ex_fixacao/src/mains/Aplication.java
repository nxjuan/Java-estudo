package mains;

import java.util.Scanner;

import P.aux_banco;

public class Aplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char resposta;
		aux_banco user1;
		
		
		System.out.print("Enter account number: ");
		int Number = sc.nextInt();
		System.out.printf("Enter account Holder: ");
		String Holder = sc.next();
		System.out.printf("Is an initial deposit (y/n): ");
		
		resposta = sc.next().charAt(0);
		if(resposta == 'y') {
			System.out.print("Enter initial deposit value: ");
			double Value = sc.nextDouble();
			user1 = new aux_banco(Holder, Number, Value);
		}else {
			user1 = new aux_banco(Holder, Number);
		}
		
		System.out.println("Updated account data");
		System.out.println("User data:");
		System.out.printf("\n");
		System.out.println(user1);
		
		System.out.printf("Enter a deposit value: ");
		user1.deposit(sc.nextDouble());
		
		System.out.printf("\nUpdated account data\n");
		System.out.println("User data:");
		System.out.println(user1);		
		
		System.out.printf("\nEnter a withdraw value: ");
		user1.withdraw(sc.nextDouble());
		System.out.printf("\nUpdated account data");
		System.out.print("\nUser data: ");
		System.out.println(user1);
		
		sc.close();
	}
}
