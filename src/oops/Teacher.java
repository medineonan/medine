package oops;

public class Teacher {
 String name, lastName;
 
 public static void main(String[] args) {
		MathTeacher mt=new MathTeacher("Hakan", "Onan");
		System.out.println(mt.name+" "+mt.lastName);
		
	}
 
 public Teacher () {// inside the teacher class i have constructors
	 
 }
  public Teacher(String name, String lastName) {
	  this.name=name;
	  this.lastName=lastName;
  }
}
     class MathTeacher extends Teacher {
	  
	  public MathTeacher(String name, String lastName) {
		  super(name,lastName);
	  
	  }
  }
  
    
	 
	
 




