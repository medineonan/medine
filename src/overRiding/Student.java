package overRiding;

public class Student {
	
    public void study() {
	
	System.out.println("Students studies");
}
    public void doHomework() {
    	
    	System.out.println("Students  do homework");
    }   
}
class Syntaxstudent extends Student { //override starts here
	
	public void study() {
		
		System.out.println("Syntax students are coding");
	}
   public void getJob() {
		
		System.out.println("Syntax students are becoming QA automation engineer");
	}
   
   public void accessParentOverridenMethod() {
	   super.study();
   }
}
class Collegestudent extends Student {
	
	public void study() {
		
		System.out.println("Syntax students are studying differnt classes");
	}
}