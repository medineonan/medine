package hashSet;
import java.util.*;
public class Task01 {
	/*3-Create a Set collection that will hold Objects of Student Type.
	In this set we do not care about the insertion order. Each student object should have name and studentID.
	 Display name of each student.
    */
	
	private String name;
	private int studentID;
	
	public void Student(String name,int strudentID) {
		this.name=name;
		this.studentID=studentID;	
	}
	public String getName() {
		return name;
	}
}
public class Task01 {
	
	public static void main(String[] args) {
		
		Set<Student> students=new HashSet<>();
		
		students.add(new Student("Samir",101));
		students.add(new Student("Karim",102));
		students.add(new Student("John",103));
		students.add(new Student("Jane",104));
		students.add(new Student("Khan",105));
		students.add(new Student("Tariq",106));
		students.add(new Student("Ahmed",107));
		
		Iterator <Student> student=students.iterator();
		while(student.hasNext()) {
			System.out.println(student.next().getName()+" ");
		}		
	}
}
	

