package interface0;

import interface0.Bank.BOA;

public class BOATest {

	public static void main(String[] args) {
		    BOA bank=new BOA();
		    bank.trust();
		    bank.deposit();
            bank.financing();
            bank.giveCredit();
            bank.withdraw();
            System.out.println("&&&&&&&&&&&&");
            Bank b=new BOA();
            b.trust();
            b.deposit();
            b.withdraw();
            System.out.println("&&&&&&&&&&&&");
            Trustable t=new BOA();
            t.trust();
	}

}
