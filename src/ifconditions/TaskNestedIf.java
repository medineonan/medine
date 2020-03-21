package ifconditions;

public class TaskNestedIf {

	public static void main(String[] args) {
		boolean diploma=true;
		boolean degree=true;
		double gpa=3;
		if (diploma) {
			System.out.println("congratulation");
		}
		if(gpa>=3.5) {
			System.out.println("you are eligible for scholarship");
		}else {
			System.out.println("you should have studied harder");
		}
		}
		
	}


