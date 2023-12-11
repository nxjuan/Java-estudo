package programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Aplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data: ");
			System.out.print("Rectangle or circle (r/c)?: ");
			System.out.print("Color (BLACK/BLUE/RED): ");
			String color = sc.next();
			char format = sc.next().charAt(0);
			if(format == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(Color.valueOf(color), width ,height));
			}else if(format == 'c') {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(Color.valueOf(color), radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS: ");
		for(Shape form : list) {
			System.out.printf("\n%.2f", form.area());
		}
		
		sc.close();
	}
}
