package abstractClass;

public class VehicleTest {

	public static void main(String[] args) {
        
	    
	    //new Vehicle("yellow");cannot
	    //new Car("sedan","yellow");cannot
	    
	Vehicle tesla=new Tesla("yellow","Sedan","Tesla");
	    tesla.drive();
	    tesla.stop();
	    tesla.brake();
	    tesla.start();
	    
	    
	    
	    Vehicle toyota= new Toyota("blue","Sedan","Toyota");
	    toyota.total();
	    
	    Vehicle toyota1=new Toyota("blue","Sedan","Toyota");
	    toyota1.total();
	    Vehicle toyota2=new Toyota("blue","Sedan","Toyota");
	    toyota2.total();
	}

}
