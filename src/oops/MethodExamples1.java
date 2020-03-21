package oops;

public class MethodExamples1 {
//want to create a method that will be greeting a person

	void greet() {
System.out.println("Mirac kandiliniz mubarek olsun");
	}
	void greet1(String name) {
		System.out.println("Mirac kandiliniz mubarek olsun"+ name);
	}
	
	
public static void main(String[]args) {
//how do I call method greet??
//className variableName=new ClassName();
//1st create an object
//where that method belongs
	
	MethodExamples1 h= new MethodExamples1();

h.greet1(" Cigdem :)");
h.greet1(" Gulbahar :)");


}
}