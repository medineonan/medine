package map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

abstract class Stores{
	
	
String type,name;

public Stores(String type, String name) { //construction
	this.type=type;
	this.name=name;
	}
    public void display() {
    	System.out.println("This is store "+name);
    }
	public abstract void workingHours(); //unimplemented method
	protected abstract void disPlay();
}
class Nike extends Stores{

	public Nike(String type, String name) {
		super(type, name);
	}
	public void workingHours() {
		System.out.println(name+ " works from 10 am till 6 pm");
	}
	}	
class Costco extends Stores{

	public Costco(String type, String name) {
		super(type, name);
	}
//override
	public void workingHours() {
		System.out.println(name+ " works from 8 am to 8 pm");
	}
}
class Amazon extends Stores{

	public Amazon(String type, String name) {
		super(type, name);
	}
	//override
	public void workingHours() {
		System.out.println(name+ " works 24 hours");
	}
}
public class Target {
	
public static void main(String[] args) {
	// we want to store  STORES in form 1-->amazon 2-->Costco 3-->nike
	
Map<Integer,Stores>	storeMap=new LinkedHashMap<>();
	storeMap.put(1, new Amazon("online","Amazon"));
	storeMap.put(2, new Costco("retail","Costco"));
	storeMap.put(3, new Nike("retail","Nike"));
	
	System.out.println(storeMap);
	//to get an access to  all methods of our STORES objects; value()||keySet() || entrySet()
	 //1.st way get all value objects
Collection<Stores>col=storeMap.values();

for(Stores store:col) {
    store.workingHours();
	store.display();
	System.out.println(".............");
}
//2.nd way get all Entry objects -->getValue();
Set<Entry<Integer, Stores>> storeSet=storeMap.entrySet();

for( Entry<Integer, Stores> entry:storeSet) {
	entry.getValue().workingHours();
	entry.getValue().disPlay();
	System.out.println("&&&&&&&&");

}	

}
	}
