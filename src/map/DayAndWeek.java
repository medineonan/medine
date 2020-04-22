package map;


import java.util.Iterator;
import java.util.LinkedHashMap; // make sure comes from UTIL
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DayAndWeek {

	public static void main(String[] args) {
		
		// create a map that store month and days 
		Map<String,Integer>month=new LinkedHashMap<>();
        month.put("January",31); //entry
        month.put("February",28);
        month.put("March",31);
        month.put("April",30);
        System.out.println(month.size());//gives numbers of entry (4)
        System.out.println("&&&&&");
        System.out.println(month);
        System.out.println("****");
        //get all entries from a map
        Set<Entry<String, Integer>>entries=month.entrySet();
        //System.out.println(entries);
        
        //loop through all entry objects
        for(Entry e:entries) {
        	System.out.println(e.getKey()+ ":"+e.getValue());
        	//System.out.println(e);
        }
        //iterator through all entry objects
        Iterator<Entry<String,Integer>> it=entries.iterator();
        while(it.hasNext()) {
 // System.out.println(it.next().getKey()+" ;value= "+it.next().getValue());
        
        Entry<String, Integer> entry=it.next();
        System.out.println(entry);
        System.out.println("Key "+ entry.getKey()+" == value"+ entry.getValue());
        }  
       
        
	}

}
