package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Task02 {

	public static void main(String[] args) {
// Create an arrayList of words. 
//Remove every word that ends with “e”. Use iterator
	
		ArrayList<String>word=new ArrayList<>();
		word.add("helezon");
		word.add("metafizik");
		word.add("apocalips");
		word.add("hamidiye");
		
		Iterator<String>myword=word.iterator();
		while(myword.hasNext()) {
			if(myword.next().endsWith("e")) {
				myword.remove();
		}
		}
		System.out.println(word);
	}
	}


