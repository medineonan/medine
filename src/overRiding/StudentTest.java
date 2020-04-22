package overRiding;

public class StudentTest {

	public static void main(String[] args) {
		
	Student student=new Student();
	student.study();
	student.doHomework();
	
	System.out.println("***overiding starts here***");
	
	Syntaxstudent syntax=new Syntaxstudent();
	syntax.doHomework();
	syntax.getJob();
	syntax.study();
	//syntax.accessParentOverridenMethod();
	System.out.println("***2nd overiding starts here***");
	Student st=new Syntaxstudent();
	st.study();
	st.doHomework();
	

	}

}
