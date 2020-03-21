import java.util.Scanner;

public class replit31 {
	 public static void main(String[] args){
		    Scanner med=new Scanner(System.in);
		    
		    System.out.println("Please enter your age");
		    int age=med.nextInt();
		    if(age>25){
		    
		    System.out.println("Please enter your gender:M or F"); 
		    String gender=med.nextLine();
		    if(gender.equals("M")) {
		     System.out.println("Man");
		    
		   }else{
			   System.out.println("You are woman");
		   }
		   }else{
			   System.out.println("Please enter your gender:M or F");
			   String gender=med.nextLine();
		   
		     
		     if(gender.equals("M")) {
		     System.out.println("Boy");
		     
		     }else{
		     System.out.println("Girl");
		     
		 }
		}
		}
        }
	
    
  

