package programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Aplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();		
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char opt = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			if(opt == 'i') {
				System.out.print("Health expenditures: ");
				double HealthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, HealthExpenditures));
			}else {
				System.out.print("Number of employees: ");
				int numOfEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, numOfEmployees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		
		double sum = 0.0;
		for(TaxPayer p : list) {
			System.out.println(p.getName() + " $ " + String.format("%.2f", p.tax()));
			sum += p.tax();
		}
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		sc.close();
	}

}
