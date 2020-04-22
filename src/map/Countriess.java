package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Countriess {

	public static void main(String[] args) {
/*Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator. */
		
		Map<String,String>countries=new HashMap<>();
		countries.put("Turkey","Ankara"); // country  is the KEY & capital is the VALUE
		countries.put("USA","D.C");
		countries.put("Greece","Athens");
		countries.put("Germany","Berlin");
		    System.out.println(countries);
		//KEY AND VALIUES ALL ENTRIES OLUYOR    
		  //get all keys
		    for(String key:countries.keySet()) {
				System.out.println("Key: "+key);
		} 
		  //get all the values
		    for(String val:countries.values()) {
		         System.out.println("Value: "+val);
		} 
             //get all values using iterator
		  Iterator<String>iterator=countries.values().iterator();
		  while(iterator.hasNext()) {
			   System.out.println("value= "+iterator.next());
		}
   
		    
		    
		    
		    
		    
		    
	}

}
