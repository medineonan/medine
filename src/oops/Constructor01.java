package oops;

public class Constructor01 {
//Write a program that will have a constructor: one with parameters and second without any parameters. 
//	Create a separate Test class where you will execute both of the constructors.

	
    Constructor01(){
    System.out.println("no parameters");
    }
    
    Constructor01(String a){
    	System.out.println("with parameters"+a);
    	}
    public static void main(String[]args) {
    	
    Constructor01 mdn=new Constructor01();
    Constructor01 mdn1=new Constructor01(" merhaba ");
    
    
    
    
    }
   	
}
