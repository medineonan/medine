package interface0;

public interface Trustable {

	void trust();	
}
interface Bank extends Trustable{
	//by default compiler will make method to be public &abstract
	void deposit();
	void withdraw();
	
class BOA extends Finance implements Bank, CreditUnion{
		
public void trust() {
System.out.println("BOA IS TRUSTABLE");
		}
public void deposit() {
System.out.println("You can make a deposit at BOA");
		}
public void withdraw() {
System.out.println("You can withdraw money  at BOA");
		}
	
public void giveCredit() {
System.out.println("BOA gives credit");
		}	
	}
//different interface and not talking to your bank
interface CreditUnion{
void giveCredit();
	}
class Finance{
public void financing(){
System.out.println("Dealing with financing");
		}
	}
}