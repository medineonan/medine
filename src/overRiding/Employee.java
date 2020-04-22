package overRiding;
//overRide yapabilmen icin inheritance olmasi gerekiyor
public class Employee {
  double salary;
  
  void getPaid() {
	  System.out.println("Employee get paid "+salary);
  }
  
  void work() {
	  System.out.println("Employee works");
  }
}
class FulltimeEmployee extends Employee{
//bilerek bos biraktim istedigim kadar class acabilecegini gostermek icin
}
class PartTimeEmployee extends Employee{
//bilerek bos biraktim istedigim kadar class acabilecegini gostermek icin	
}
class Contractor extends Employee{
	double hourlyRate;
//parent classdan overiding yaptik yani getpaid salary hourly yaptik 
    void getPaid() {
	System.out.println("Contractor get paid "+ hourlyRate);	
	}
}