package Scanner;

import java.util.Scanner;


//Create a Java program that will ask if user has a credit card or not. If you
// user does not have a credit card then offer them.
// If they do have one ask what is balance on the card?
// If balance of the card is larger than 1000, tell them to pay off immediately,
// otherwise you can tell them that they can spend more

public class ScannerinJva{
public static void main(String []args) {
Scanner scan=new Scanner(System.in);

System.out.println("Do you have credit card? ");
String cc=scan.nextLine();

 if (cc.equalsIgnoreCase("Yes")) {
	System.out.println("What is the balance on your card? ");
 int balance=scan.nextInt();
 
 if(balance>1000) {
	 System.out.println("Pay off immediately PLEASE");
	 }else {
		 System.out.println("Spend more");
	 }
 
 }else if(cc.equalsIgnoreCase("No")){
	 System.out.println("Do you want to apply for a credit card? ");
	 
 }else{
	 System.out.println("Invalid Entry");
	 
 }
 
 
 
} 


}

 


	
	
	
	


