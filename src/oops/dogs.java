package oops;

public class dogs {

	
	String breed;
	String color;
	String name;
	int age;
	
	void eat() {
		System.out.println(name +" is of course need to eat.");
		}
	void bark() {
		System.out.println(breed +" 's way of communication.");
	}
	// main method starts here!!!!
	public static void main(String[] args) {
		
		dogs dog=new dogs();
	dogs dog1=new dogs();
	dog1.breed="Golden retriever";
	dog1.color="yellow";
	dog1.name="Luke";
	dog1.age=5;
	
	dog1.eat();
	dog1.bark();
	
	dogs dog2=new dogs();
	dog2.breed="St.Bernard";
	dog2.color="white & brown";
	dog2.name="Dott";
	dog2.age=1;
	// using method to define the behaviors
	dog2.eat();
	dog2.bark();
	
	
System.out.println("I love to pet"+" my "+dog1.breed+" "+"called " + dog1.name);
	
	
	}
}
