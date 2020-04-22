package map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class EntrySetExp {

	public static void main(String[] args) {
	Map<String, String>land=new TreeMap<>();
	land.put("Togo","Lome");
	land.put("Iran","Tahran");
	land.put("SAU","Jeddah");
	System.out.println(land);// printing map
	System.out.println(land.size());
	
	
	//storing all entry objects into a set
	Set<Entry<String,String>>allEntries=land.entrySet(); //printing set
	System.out.println(allEntries);
	
	//loop through all the entries to get a key and a values
	for(Entry<String, String>entr:allEntries) {
	String key=entr.getKey();
	String value=entr.getValue();
	System.out.println(key.toUpperCase()+"------"+value.toLowerCase());
		
		
	//get the value through the iterator olanalari kendin yap pleasee
		
	}
	}

}
