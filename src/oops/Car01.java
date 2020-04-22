package oops;

public class Car01 {
	String make, model;
	public Car01() { //constructor can have access modifier
		System.out.println("I am parent class constructor");
	}
	public Car01(String make, String model) {
		this.make=make;//initialize happens
		this.model=model;
	}
}
class Mercedes extends Car01 { //constructors are not participate inheritance it will have own constructor
	String sportModel;
	public Mercedes() {
		//super();//compiler add super()by default to the parent class constructor
		System.out.println("I am a child class constructor");
	}
	public Mercedes(String make, String model, String sportModel) {
		super(make, model);//to call to our parameterized constructor. super refers to the immediate constructor(Car constructor here)
		this.sportModel= sportModel;//as soon as Java sees super keyword jumps to the immediate constructor(Car constructor) and keeps going
		//NOte(this:I am in the Mercedes class and initialize sportModel )
	}
	public void display() {
		System.out.println("I have "+make+" "+model+" "+sportModel); //have an access to the child class
	}
}