package overRiding;

public class Computer {
	String make;
	public Computer(String make) {
	this.make=make;
	}
	public void display() {
	System.out.println("I have "+make);
	}
	public void start() {
	System.out.println(make+" Computer starts by pushing button");
	}
	}
	class Apple extends Computer{
	public Apple(String make){
	super(make);
	}
	public void start() {
	System.out.println(make+" starts with faceId");
	}
	}
	class Lenovo extends Computer{
	public Lenovo(String make) {
	super(make);
	}
	public void start() {
	System.out.println(make+" starts with fingerprint");
	}
	}
	class Hp extends Computer {
	public Hp (String make) {
	super(make);
	}
	public void start() {
	System.out.println(make+" starts by voice command");
	}
	}
	class Dell extends Computer{
	public Dell(String make) {
	super(make);
	}
	}

