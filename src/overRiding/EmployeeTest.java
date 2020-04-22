package overRiding;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Employee mdn=new Employee();
     mdn.salary=57000;
     mdn.getPaid();
     
     FulltimeEmployee hkn=new FulltimeEmployee();
     hkn.salary=150000;
     hkn.getPaid();
     
     
     Contractor orh=new Contractor();
     orh.hourlyRate=50;
     orh.getPaid();
	}

}
