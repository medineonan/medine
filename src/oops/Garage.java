package oops;

public class Garage {

	public static void main(String[] args) {
		
	Car car=new Car();
Car car1=new Car();
car1.make="Bmw";
car1.model="M series";
car1.year=2020;
car1.color="red";

	Car car2=new Car();	
	car2.make="toyota";
	car2.model="rav4";
	car2.year=2020;
	car2.color="white";
	
	System.out.println(" I love to drive "+" my "+car2.make+" "+ car2.model);
	
	
	}

}
