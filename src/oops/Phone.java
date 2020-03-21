package oops;

import java.util.Scanner;

public class Phone {
//Create a Class “Phone”. 
//	Create 3 Objects of it: iPhone, Android, Nokia
//with specific  attributes and behaviors.
	// inside the class we have variables and methods(void user defined method)
	String make;
	String model;
	private boolean voiceSensitivity;
	
	void fingerPrint() {
		System.out.println(make+" You can access everything via your fingerprint");
	}
	void voiceSensitivity() {
		System.out.println(model +" Just tell what you want. ");
	}

	public static void main(String[] args) {
		
		Phone phone=new Phone();
	Phone phone1=new Phone();
	phone1.make="Apple";
	phone1.model="Iphone 11";

	phone1.fingerPrint();
	phone1.voiceSensitivity();

	Phone phone2=new Phone();
	phone2.make="Samsung";
	phone2.model="Note 10";

	phone2.fingerPrint();
	phone2.voiceSensitivity();

System.out.println("Some people prefer "+phone2.make);
System.out.println("However  when you crack the screen "+phone1.make+ " is cheaper than " + phone2.make+"!");

String str="Hello Friends";
str=str.replace("Hello", "Merhaba");
		System.out.println(str);
		// scan ekleme
Scanner scan=new Scanner(System.in);
System.out.println("What kind of phone model you have?");
scan.nextLine();
System.out.println("Some people prefer "+phone2.make);
	
	}

}