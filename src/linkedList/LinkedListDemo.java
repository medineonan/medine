package linkedList;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList <String> mdn=new LinkedList<>();
		mdn.add("Yunus");//comes from Collection
		mdn.add(0, "Reyhan");// comes from List
		mdn.add("Pevel");
		mdn.add("Farid");
		
		int size=mdn.size();
		System.out.println(size);
		
		//get all elements 1 by 1 3 different ways
 for (int i=0;i<mdn.size();i++) {
	 System.out.println(mdn.get(i));
 }
 for(String a:mdn){
	 System.out.println(a);
	 }

 
	}
}
