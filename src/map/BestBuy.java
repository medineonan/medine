package map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class BestBuy {

	public static void main(String[] args) {
		/*Create a map of Best Buy store. 
		 * Place item id and item name into it.
		 * Example (7664847 = Printer, 7879885= TV etc )
          Retrieve all keys and values from a Best Buy map using EntrySet.*/
		
		Map<Integer,String>item=new TreeMap<>();
		item.put(123,"Tv");
		item.put(444,"Laptop");
		item.put(555,"Usb");
		System.out.println(item);
		
		//storing all entry objects into a set
		Set<Entry<Integer, String>>allEntries=item.entrySet(); //printing set
	
		//loop through all the entries to get a key and a values
		for(Entry<Integer, String>mdn:allEntries) {
		Integer key=mdn.getKey();
		String value=mdn.getValue();
		System.out.println(key+"="+value);
			
			
		}
	}

}
