package oops;
public class Methods06 {
	char getGrade(int a) {
		char grade;
		
		if(a>90) {
			grade='A';
		}else if (a<=90 && a>80) {
			grade='B';
		}else if (a<=80 && a>70) {
			grade='C';
		}else {
			grade='F';
		}
		return grade;
	}
 public static void main(String[]args) {
	 
	 Methods06 m=new Methods06();
	 char grade= m.getGrade(25);
 
	 
	 System.out.println(grade);	

  //if grade is A or B---->good job,otherwise--->study more
     
     if(grade=='A' || grade=='B') {
    System.out.println("good job");	 
     }else {
    	 System.out.println("study more");	  
     }
   
 }
}