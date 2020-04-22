package map;
import java.util.*;
public class grocery {

	public static void main(String[] args) {
		
	//create a map of items to NOT to care the ORDER
	Map<String,Integer>grocery=new HashMap<>();
	grocery.put("milk",1);
	grocery.put("avocado",2);
	grocery.put("cheese",3);
	grocery.put("milk",1);
	    System.out.println(grocery);
	
	//create a map of items to save the order
	Map<String,Integer>household=new LinkedHashMap<>();
	household.put("lysol",5);
	household.put("toilet paper",15);
	household.put("shampoo",6);
	    System.out.println(household);
	
	//create a map that we store all previous items ascending order
	Map<String,Integer>shopping=new TreeMap<>(grocery);
	shopping.putAll(household);
	    System.out.println(shopping);
	
	//get all keys
	for(String key:shopping.keySet()) {
		System.out.println("Key: "+key);
}
	
   //get all keys using iterator
   Iterator<String> it=shopping.keySet().iterator();
   while(it.hasNext()) {
	    System.out.println("Key= "+it.next());
}

	//get all the values
   for(int val:shopping.values()) {
        System.out.println("Value: "+val);
	
}

	//get all values using iterator
  Iterator<Integer>iterator=shopping.values().iterator();
  while(iterator.hasNext()) {
	   System.out.println("value= "+iterator.next());
}


 }
}
