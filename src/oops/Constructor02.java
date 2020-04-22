package oops;

public class Constructor02 {
	//Write a java program of Class Students that takes students name and 3 subject grades.
	//Inside your class also have a method to Calculate Average Grade. 
	//Test Student class for 5 different students with different marks. 
	//Your program should print an average mark of each students name.
String name;
int grade1, grade2, grade3;
		
Constructor02 (String studentName, int studentGrade1,int studentGrade2,int studentGrade3){
	name=studentName;
	grade1=studentGrade1;
	grade2=studentGrade2;
	grade3=studentGrade3;
}
public int gradeAverage() {
	int total= grade1 + grade2+ grade3;
	int average=total/3;
	return average;
}
	
public static void main(String[] args) {
	Constructor02 mdn1=new Constructor02("Cigdem",90,95,100);
	System.out.println("Student "+mdn1.name+ " average grade is "+mdn1.gradeAverage());
	
	Constructor02 mdn2=new Constructor02("Ayse",100,85,75);
	System.out.println("Student "+mdn2.name+ " average grade is "+mdn2.gradeAverage());
	
    Constructor02 mdn3=new Constructor02("Zeynep",85,85,95);
    System.out.println("Student "+mdn3.name+ " average grade is "+mdn3.gradeAverage());
}
}

