package overRiding;

public class Animal {

	
	public static void whoAmI() {
		System.out.println("I AM AN ANIMAL");
	}
	public void sleep() {
		System.out.println("Animal sleep &");
	}
}
// OVERRIDE

class Bird extends Animal{
	

public static void whoAmI() {
	System.out.println("I am a bird $");
}
public void sleep() {
	System.out.println("Bird sleeps!");
}
}