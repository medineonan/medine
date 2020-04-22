package oops;

public class Methods05 {
//Create a method that will say Hello 
//in different language based on the country 
//	that will passed when method is executed. 

void language(String country) { 
	
	switch(country) {
	  case "England":
	System.out.println("hello");
	break;
       case "SAU":
	System.out.println("marhaba");
	break;
	   case "Mexico":
	System.out.println("ola");
	break;
	default:
		System.out.println("wrong language");
	}
	}

	public static void main(String []args) {
	Methods05 h=new Methods05();	
	h.language("SAU");
	h.language("Mexico");
	h.language("England");
	h.language("Turkey");
	}
	}
