package oops;

public class Google {
//define features such a id,name,salary
//define a behavior working,get paid

int id;
double salary;
String name,title;

void working() {
	System.out.println(name+ " is working"+ " as a "+title);
}
void getPaid() {
	System.out.println(name+ " is getting paid " + salary);
}

public static void main(String[]args) {
	//creating 1st object
	Google emp1=new Google();
	emp1.id=123;
	emp1.name="Hakan";
	emp1.title="Ceo";
	emp1.salary=200000;
	emp1.working();
	emp1.getPaid();
//create 2nd object
	Google emp2=new Google();
	emp2.id=456;
	emp2.name="Medine";
	emp2.title="Tester";
	emp2.salary=150000;
	emp2.working();
	emp2.getPaid();
}











}
