package application;

import entities.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    Locale.setDefault(Locale.US);
	    
	    System.out.print("How many employees will be registerd? ");
	    int n = sc.nextInt();

	    List<Employee> list = new ArrayList<>();
	    
	    for(int i = 0; i < n; i++) {
	    	System.out.println("Employee #" + (i+1) + ":");
	    	System.out.print("Id: ");
	    	Integer id = sc.nextInt();
	    	System.out.print("Name: ");
	    	sc.nextLine();
	    	String name = sc.nextLine();
	    	System.out.print("Salary: ");
	    	Double salary = sc.nextDouble();	
	    	
	    	Employee emp = new Employee(name, id, salary);
	    	list.add(emp);
	    }
	    
	    System.out.println("Enter the employee id that will have salary increase: ");
	    
	    int idSalary = sc.nextInt();
	    Integer posicao =  SearchId(list, idSalary);
	    if(posicao == null) {
	    	System.out.println("This is does not exist!");
	    }else {
	    	System.out.print("Enter the porcentage: ");
	    	double percent = sc.nextDouble();
	    	list.get(posicao).increaseSalary(percent);
	    }
	    System.out.println();
	    System.out.println("List of Employees: ");
	    
	    for(Employee emp: list) {
	    	System.out.println(emp);
	    }
	    
	    sc.close();
	}

	public static Integer SearchId(List<Employee> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}						
		}
		return null;
	}
}

