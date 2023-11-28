package P;


public class Dados {
	 private String name;
	  private Integer id;
	  private Double salary;

	  public Dados() {
		  
	  }
	  
	  public Dados(String name, Integer id, Double salary){
	    this.name = name;
	    this.salary = salary;
	    this.salary = salary;
	  }
	  
	  public Dados(Integer id) {
		  this.id = id;
	  }
	  
	  public String getName() {
	  	return name;
	  }
	  public void setName(String name) {
	  	this.name = name;
	  }
	  public Integer getId() {
	  	return id;
	  }
	  public void setId(Integer id) {
	  	this.id = id;
	  }
	  public Double getSalary() {
	  	return salary;
	  }
	  
	  public void increaseSalary(double porcentage) {
		  salary += salary * porcentage / 100;
	  }
}
