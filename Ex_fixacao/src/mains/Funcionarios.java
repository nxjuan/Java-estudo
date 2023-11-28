package mains;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import P.Dados;


public class Funcionarios {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
	    System.out.print("How many employees will be registred? ");
	    int n = sc.nextInt();
	    List<Dados> funcionario = new ArrayList<>();
	    
	    for(int j = 0; j < n; j++){
	      System.out.println("Employee #" + j+1 + ":");
	      System.out.print("Id: ");
	      int id = sc.nextInt();
	      System.out.print("Name: ");
	      String name = sc.next();
	      System.out.print("Salary: ");
	      double salary = sc.nextDouble();
	      funcionario.add(new Dados(name, id, salary));
	    }
	    


	    for(int i = 0; i < n; i++){
	      
	    }

	}

}
