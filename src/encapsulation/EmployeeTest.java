package encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
	
Employee emp= new Employee();
emp.setName("Hakan");//if(!name.isEmpty()&& name.length()>3)SO NULL 
     System.out.println(emp.getName());
     
     emp.setAge(40);
     System.out.println(emp.getAge());
	}
// HAKAN YAZARSAM CIKAR NULL OLMAZ
}
