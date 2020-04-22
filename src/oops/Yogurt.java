package oops;

public class Yogurt { 
String brand; //these are instance variables
String size;
int price;

public void smell() {
	System.out.println(brand+ " smells fresh fruit");
}
public void taste() {
	System.out.println(brand +" tastes like your mom made");
}
public void moneySaver() {
	System.out.println(" Everyone can buy because it is just $ "+price);
}

public static void main(String[] args) {
	
Yogurt mdn1=new Yogurt();//we created object.(mdn1)
mdn1.brand="Chobani";
mdn1.size="small";
mdn1.price=3;

mdn1.smell();
mdn1.taste();
mdn1.moneySaver();	
	
Yogurt mdn2=new Yogurt();
mdn2.brand="Ulker";
mdn2.size="medium";
mdn2.price=5;

mdn2.smell();
mdn2.taste();
mdn2.moneySaver();	
		
	
}
}