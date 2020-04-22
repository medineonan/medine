package oops;

public class This01 {

	int a; //instance variable
	int b;
//if local & instance variables have the same name so  use this.
	
	public This01(int a,int b) {
	this.a=a;
	this.b=b;
	
	}
	
	public void sum(int a, int b) {
//		
System.out.println("The sum of local variable "+(a+b));
System.out.println("The sum of instance variable "+(this.a+this.b));
	}

public static void main(String[] args) {
	This01 mdn=new This01(10,5);
	mdn.sum(100, 200);
}

}
