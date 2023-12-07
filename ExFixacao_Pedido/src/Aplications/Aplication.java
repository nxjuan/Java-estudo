package Aplications;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Products;
import entities.enums.OrderStatus;

public class Aplication {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);	
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyy");		
		
		System.out.println("Enter the client data: ");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Email: ");
		sc.nextLine();
		String email = sc.next();
		System.out.print("Birthday date (DD/MM/YYYY): ");
		String birtdatTemp = sc.next();
		LocalDate birtday = LocalDate.parse(birtdatTemp, dtf);
		Client client = new Client(name, email, birtday);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		System.out.print("How many items to this order?: ");
		int n = sc.nextInt();
		
		Order order = new Order(LocalDateTime.now(), status, client);
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String itemName = sc.nextLine();
			System.out.print("Product price: ");
			double itemPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int itemQuantity = sc.nextInt();
			Products p = new Products(itemName, itemPrice);
			OrderItem pedido = new OrderItem(itemQuantity, itemPrice, p);		
			order.addItem(pedido);
		}			
		
		System.out.println("\n\n" + order);
		
		
	}

}
