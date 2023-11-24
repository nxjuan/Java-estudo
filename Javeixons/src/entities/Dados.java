package entities;

class Dados{
  private String name;
  private Integer id;
  private Double salary;

  public Dados(String name, Integer id, Double salary){
    this.name = name;
    this.id = id;
    this.salary = salary;
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

  void adjustSalary (double percent){
    salary += salary * percent / 100;
  }
}
