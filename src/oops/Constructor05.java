package oops;

public class Constructor05 {
// create variables to hold state and capital of the state
	
String state, stateCapital;
//create a method to show the state &stateCapital	

public void display() {
	System.out.println("I live in " +state+ " and its capital is "+ stateCapital);
}

// create a constructor to initialize instance variables
public Constructor05 (String usaStates, String usaCapital) {
	state=usaStates;
    stateCapital= usaCapital;
}

public static void main(String[] args) {
	Constructor05 mdn=new Constructor05("New Hapmshire","Concord.");
	mdn.display();
}
}
