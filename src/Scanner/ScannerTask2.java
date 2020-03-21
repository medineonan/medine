package Scanner;

import java.util.Scanner;

public class ScannerTask2 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("How long have you been worked? ");
	int year=scan.nextInt();
	
	if(year>=5) {
		System.out.println("what is your annual salary?");
			
		}
        System.out.println("you are eligible for bonus ");
		double salary=scan.nextDouble();
		
	if(salary>50000) {
		System.out.println("Your bonus is $5000.00 . ");
		
	}else {
		System.out.println("Your bonus is $3000.00 .");
	}
	
	}
		
	}
	
	
		
		




