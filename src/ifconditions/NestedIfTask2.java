package ifconditions;

public class NestedIfTask2 {

	public static void main(String[] args) {
     double mortgageRate =3.5;
     int mortagagePrice=150000;
     if (mortgageRate>4.5) {
	
    	 System.out.println("you will not buy a house");
	}else{
		 System.out.println("you will buy");
	if(mortagagePrice>200000) {
		System.out.println("you will take a loan");
	}else{
		System.out.println("you will pay cash");
	}
	}
	}

}
