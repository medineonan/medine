package abstractClass;

 public abstract class Vehicle {
	 static int totalVehicles;
	    
	    String color;
	    Vehicle(String color) {
	        this.color = color;
	        totalVehicles++;
	    }
	    public  void total () {
	        System.out.println("We build "+totalVehicles);
	    }
	    public void drive() {
	        System.out.println("Vehicle drives");
	    }
	    public void stop() {
	        System.out.println("Vehicle stops");
	    }
	     abstract void start();
	    public abstract void brake();
	    
//can abstract method be static?NO
//public abstract static void m1(); This method requires a body instead of a semicolon
//can abstract method be final?NO
//public abstract static void m2();The abstract method m2 in type Vehicle can only set a visibility modifier, one of public or protected
//can abstract method be private?NO
//private abstract static void m2();The abstract method m2 in type Vehicle can only set a visibility modifier, one of public or protected
	}
	abstract class Car extends Vehicle {
	    String carType;
	    Car(String color, String carType) {
	        super(color);
	        this.carType = carType;
	    }
	    public void brake() {
	        System.out.println(carType + " have brakes");
	    }
	}
	class Tesla extends Car {
	    String make;
	    Tesla(String color, String carType, String make) {
	        super(color, carType);
	        this.make = make;
	    }
	    public void drive() {
	        System.out.println("Vehicle drives");
	    }
	    @Override
	    public void start() {
	        System.out.println(make+" starts remotely");
	}
	    public void display() {
	        System.out.println("We have "+color +" " +make+" starts remotely");
	}
	}
	    class Toyota extends Car {
	        String make;
	        
	        Toyota(String color, String carType,String make) {
	            super(color, carType);
	            this.make=make;
	        }
	        @Override
	        public void start() {
	        System.out.println(make+" starts keyless");
	            
	        }
}