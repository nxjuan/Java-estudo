package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enumns.WorkerLevel;

public class Worker {
	
	private String name;
	private WorkerLevel level;
	private Double baseSalary;	
	private Departments department;	
	
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker() {		
	}
	
	public Worker(String name, WorkerLevel level, Double baseSalary, Departments department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public WorkerLevel getLevel() {
		return level;
	}
	public void setLevel(WorkerLevel level) {
		this.level = level;
	}
	public Double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public Departments getDepartment() {
		return department;
	}
	public void setDepartment(Departments department) {
		this.department = department;
	}
	public List<HourContract> getContracts() {
		return contracts;
	}	
	
	public void addContract(HourContract contract) {
		this.contracts.add(contract);
	}
	public void removeContract(HourContract contract) {
		this.contracts.remove(contract);
	}
	
	public double income(int year, int month) {
		int i = 0;
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		System.out.println("calendario " + cal.get(Calendar.DAY_OF_MONTH) + "/" + cal.get(month) + "/" + cal.get(Calendar.YEAR));
		
		do {
			System.out.println("Entrou no for");
			cal.setTime(contracts.get(i).getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			System.out.println("antes do if");
			if(year == c_year && month == c_month) {
				System.out.println("Está entrando no if");
				sum = contracts.get(i).totalValue();
			}
		}while(i < contracts.size());
		return sum;
		
		/*
		for (HourContract c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			System.out.println("antes do if");
			if(year == c_year && month == c_month) {
				System.out.println("Está entrando no if");
				sum = c.totalValue();
			}
		}
		return sum;
		*/
	}
}
