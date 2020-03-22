package oops;

public class Methods01 {
// create a method isRaining
// that will accept boolean val as a param
// and based on the value it will print message
void isRaining (boolean isRain) {
	if(isRain) {
		System.out.println("Stay at home");
	}else {
	System.out.println("It is sunny go out have fun");	
	}
}
public static void main(String[]args) {
	Methods01 m=new Methods01();
     m.isRaining(true);
     m.isRaining(false);
}




}
