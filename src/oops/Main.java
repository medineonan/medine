package oops;



class Main {
	
	class Parent{
		
		  public void display(){
		    
		       System.out.println("m1 method in parent class");
		  }
		}
		class child extends Parent{
		 
		 public void display(){
		   super.display();
		    System.out.println("m1 method in child class");
		  }
		}
		public static void main(String[]args){
		    Main mdn=new Main();
		
		  }
		 
		}

