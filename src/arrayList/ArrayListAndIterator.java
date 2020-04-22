package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAndIterator {

	public static void main(String[] args) {
//lets create an ArrayList of chocolate
		ArrayList<String>choco=new ArrayList<>();
		choco.add("kinder");
		choco.add("godiva");
		choco.add("kit kat");
		choco.add("snikers");
		
//create arrayList of sweets
				
		ArrayList<String>sweets=new ArrayList<>();
	     sweets.add("ice cream");
	     sweets.add("cheese cake");
	     sweets.addAll(choco);
	     System.out.println(sweets.size());
	     System.out.println(sweets);
// we want to iterate through the collection.Iteration da sadece  hasNext(),next(),remove() methodlari var
//while yaparsak hepsini yazar action continues .if yaparsak ilk siradaki ice cream alir cunku true	     
	     Iterator<String> mdn =sweets.iterator();
	     while (mdn.hasNext()) {
	    	 String elements=mdn.next();
	    	 System.out.println(elements);
	    	 if(elements.equals("ice cream")) {
	    		 mdn.remove();
	    	 }
	     }
	     
	     System.out.println("____arraylist after removing element____");
	     System.out.println(sweets);
// get the elements backwards
	     for(int i=sweets.size()-1;i>=0; i--){
	    	System.out.print(sweets.get(i)+";"); 
	     }
//advanced for loop
//iterates/loops in 1 direction
	     for(String str:sweets) {
	    	 System.out.println(str);
	     }
	     
	
	
	
	
	
	}

}
