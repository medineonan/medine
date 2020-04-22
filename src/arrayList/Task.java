package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {

	public static void main(String[] args) {
// Create an arraylist of cars and retrieve all the values using 3 different ways.

ArrayList<String>car=new ArrayList<>();
car.add("bmw");
car.add("toyota");
car.add("kia");
car.add("honda");

System.out.println(car);
System.out.println("****");
for(String a:car) {
	System.out.println(a);
}
System.out.println("####");
//2.for loop
for(int i=0; i<car.size(); i++) {
	String d=car.get(i);
    System.out.println(d);	
}
System.out.println("^^^^^");
//3.Iterator
Iterator<String>iterator=car.iterator();

while(iterator.hasNext()) {
	String d=iterator.next();
	System.out.println(d);
}











}
}