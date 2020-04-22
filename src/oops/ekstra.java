package oops;

public class ekstra {

		String word;
		int a; int b;
		
		void mult(String word,int a,int b) {
		   
		    System.out.println(word+(a*b));
		    }

		void add(String word,int a,int b) {
		   
			System.out.println(word+(a+b));	
		}
		void sub(String word,int a,int b) {
		    
		    System.out.println(word+(a-b));
		    }
		public static void main(String []args) {
			
		ekstra xr=new ekstra();

		      xr.add("Addition=",10,20);
		      xr.mult("Multiplication",6,5);
		      xr.sub("Subtraction",30,10);
		    
		  
		}
		}