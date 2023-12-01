package entities;

import java.time.LocalDate;
import java.util.Date;

public class HourContract {
	
	 private LocalDate date;
	 private Double valuePerHour;
	 private Integer hours;
	 
	 public HourContract() {
		 
	 }

	public HourContract(LocalDate contractDate, Double valuePerHour, Integer hours) {
		this.date = contractDate;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public double totalValue(){
		return valuePerHour * hours;
	}
}
