package oops;

public class CarTest {

	public static void main(String[] args) {
		//Car car = new Car();//call to the parent class constructor
		System.out.println("---------------");
	  Mercedes mdn = new Mercedes(); //calling to the child class constructor
	  mdn.display();	
	   
	  Mercedes mdn1 = new Mercedes("Mercedes", "M", "NO AMG");
	  mdn1.display();
	   
	  Mercedes mdn2 = new Mercedes("Mercedes", "S", "AMG");
	  mdn2.display();
	   
	}
	}