package Aplications;

import java.util.Scanner;

import Entities.Triangle;

import java.util.Locale;

class Main {
  public static void main(String[] args) {
	  
	  Locale.setDefault(Locale.US);
	  Scanner sc = new Scanner(System.in);
	  
	  Triangle x, y;
	  x = new Triangle();
	  y = new Triangle();
	  
	  System.out.println("Entre com os dados do primeiro triangulo");
	  	   
	  x.a = sc.nextDouble();
	  x.b = sc.nextDouble();
	  x.c = sc.nextDouble();
	  
	  System.out.println("Entre com os dados do segundo triangulo");
	  
	  y.a = sc.nextDouble();
	  y.b = sc.nextDouble();
	  y.c = sc.nextDouble();

	  
	  double ax = x.area();
	  System.out.printf("Área do triangulo 1:  %.2f\n", ax);

	  
	  double ay = y.area();
	  System.out.printf("Área do triangulo 2:  %.2f\n", ay);
	  	  
	  if(ax>ay) {
		  System.out.printf("Maior Área: %.2f\n", ax);
	  }else {
		  System.out.printf("Maior Área: %.2f\n", ay);
	  }
  }
}