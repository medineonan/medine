package oops;

public class Doctor {
	int doctorId;
	String name;
	
	public Doctor(String name, int doctorId) {
	this.name=name;
	this.doctorId=doctorId;
	}
	public static void main(String[] args) {
	Dentist obj = new Dentist("yunus",123,"yakut");
	obj.display();
	}
	}
	class Dentist extends Doctor {
	String lastname;
	Dentist(String name, int doctorId,String lastname){
	//complier will try to make call to parent class constructor super();
	super(name,doctorId);
	this.lastname=lastname;
	}
	void display() {
	System.out.println(name+lastname+doctorId);
	}
	}

