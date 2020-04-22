package oops;

public class Doktor {
String name;
String licenceId;
int salary;

public Doktor(String name,String licenceId,int salary) {
	this.name=name;
	this.licenceId=licenceId;
	this.salary=salary;
}
public void checkUp() {
	System.out.println("Doktor "+name+" ordered blood test.");
}
public void treatPatient(String patientName) {
	System.out.println("Doktor "+this.name+" gives prescription to "+patientName+".");
	chargePatient();
}
public void chargePatient() {
	System.out.println("I am going to charge $100.");
}
public void displayInfo() {
	System.out.println("Doktor "+name+" with licenceId "+" "+licenceId+" gets "+salary+" per year.");
}
public void payBill( String patientName) {
	System.out.println("Doktor "+name+" wants "+patientName+ " to pay the bill ASAP.");
}

public static void main(String[] args) {
	Doktor mdn;
	mdn=new Doktor("Hakan Onan","12345",1500000);
    mdn.name="Hakan Onan";
	mdn.licenceId="12345";
	mdn.chargePatient();
	mdn.treatPatient("Ayse Hanim");
	mdn.salary=1500000;
	mdn.displayInfo();
	mdn.checkUp();
	mdn.payBill("Zeynep");
	
	Doktor mdn1=new Doktor("Mehmet Oz","3425",500000);
	mdn1.displayInfo();
	//mdn1.checkUp();
	Doktor mdn2=new Doktor("Medine Onan","2525",3500000);
	mdn2.displayInfo();
	//mdn2.payBill("Cigdem");
}
}
