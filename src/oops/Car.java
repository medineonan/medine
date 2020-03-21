package oops;

public class Car {
// define feature of the car
	String make;
	String model;
	String color;
	int year;
	//define behaviour
	
	void remoteStart() {
System.out.println("No need to be in  "+make);
	}
	
	void MakeNoise() {
		System.out.println(make + " does not make noise");
	}
	void stopFreezing() {
		System.out.println("Engine can start with the remoteCtrl");
	}
public static void main(String[] args) {
	
	Car car=new Car();
Car car1=new Car();
car1.make="Bmw";
car1.model="M series";
car1.year=2020;
car1.color="red";
//accessing behavior/ methods of  car with Car1
car1.MakeNoise();
car1.remoteStart();
car1.stopFreezing();
	Car car2=new Car();	
	car2.make="toyota";
	car2.model="Rav4";
	car2.year=2020;
	car2.color="white";
	
System.out.println("I  have to love  "+car2.make +" because "+" my car "+" is " + car2.model+"!");
	System.out.println(car2.model+" is my reality");
}
	}