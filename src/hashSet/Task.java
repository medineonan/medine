package hashSet;
import java.util.*;
public class Task {

	public static void main(String[] args) {
		
		/*	1- Create a Set collection in which you need to add names of the countries.
		 *  In this set we want all objects to be sorted in alphabetical order.
		 * Using 2 different ways retrieve all elements from set.
		*/
			
			Set <String> countries=new TreeSet<>();
			countries.add("Afghanistan");
			countries.add("Monaco");
			countries.add("Bahrain");
			countries.add("Oman");
			countries.add("Chile");
			countries.add("Poland");
			countries.add("Djibouti");
			countries.add("Cuba");
			countries.add("Slovakia");
			
			for (String country:countries) {
				System.out.print(country+" ");
			}
			System.out.println();
			System.out.println("---------------------------------------------");
			
			Iterator<String>country=countries.iterator();
			while(country.hasNext()) {
				System.out.print(country.next()+", ");
			}
			 System.out.println();		
			System.out.println("*********************************************");
			
			/*2-Create a Set of cities in which you want to make sure that insertion order is maintained.
			 *Using Iterator remove any city that starts with �A�;
			*/
			
			Set<String> cities=new LinkedHashSet<>();
			cities.add("Charles City");
			cities.add("Franklin");
			cities.add("Abingdon");
			cities.add("Farmville");
			cities.add("Ashland");
			cities.add("Wintergreen");
			cities.add("Richmond");
			
			System.out.println(cities);
			Iterator<String> city =cities.iterator();
			
			while(city.hasNext()) {
				
				if (city.next().toLowerCase().startsWith("a"))
			       city.remove();
			}
			System.out.println(cities);
			System.out.println("********************************************");
			
			
		}
		
	}

