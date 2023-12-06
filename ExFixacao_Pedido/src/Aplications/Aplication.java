package Aplications;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Client;
import entities.OrderItem;
import entities.Products;

public class Aplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyy");
		
		Products p = new Products("Tv", 1000.0);
		
		OrderItem oi1 = new OrderItem(1, 1000.0, p);		
		
		System.out.println(oi1);
		
		System.out.println("Enter the client data: ");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birthday date (DD/MM/YYYY): ");
		String birtdatTemp = sc.next();
		LocalDate birtday = LocalDate.parse(birtdatTemp, dtf);
		Client client = new Client(name, email, birtday);
		
		System.out.println("How many items to this order?: ");
		int n = sc.nextInt();
		
		for(int i = 0; i <= n; i++) {
			System.out.println("Enter " + i + " item data:");
			System.out.print("Item name: ");
			String itemName = sc.next();
			System.out.print("Item price: ");
			Double itemPrice = sc.nextDouble();
			System.out.print("Quantity");
			Integer itemQuantity = sc.nextInt();
			Item
		}
		
		
		
	}

}
