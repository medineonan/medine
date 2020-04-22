package encapsulation;

public class Employee {
//define private variables
	private String name;
	private int age;
	private double salary;
	
	// define public methods to give an access to private variables
	//  get return the value
    public String getName() {
		return name;
		}
	
	public int getAge() {
		return age;
		
		}
	
    public double getSalary() {
		return salary;
	}
	 
	// setters purpose of set the value
	public void setName(String name) {
	     if(!name.isEmpty()&& name.length()>3) {
	     this.name=name;
	 }
	}
	
	public void setAge(int age) {
		if (age>1) {
		this.age= age;
		}
		}
	
	public void setSalary(double salary) {
		this.salary =salary;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
