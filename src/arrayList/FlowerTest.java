package arrayList;

import java.util.ArrayList;

public class FlowerTest {

	public static void main(String[] args) {
	//flowers into array
	Flower [] flowerArray={new Rose("Rose"),new Tulip("Tulip")};
	
	//flowers into arraylist
	ArrayList<Flower>mdn=new ArrayList<>();	
	mdn.add(new Rose("Rose"));
	mdn.add(new Tulip("Tulip"));// adding the object of the flower type
	
	//mdn.add("tulip"); can not add string object into Arraylist of  Flower objects
	// to call avaliable methos for loop, advanced for loop,iterator 
		// buraya yap
		
		
		

	}

}
