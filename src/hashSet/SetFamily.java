package hashSet;

import java.util.*;

public class SetFamily {

	public static void main(String[] args) {
		
		Set<String>veggies=new HashSet<>();
		veggies.add("carrot");
		veggies.add("potatoe");
		veggies.add("cucumber");
		veggies.add("aubergine");
		veggies.add("potatoe");
		veggies.add("cucumber");
		
		System.out.println(veggies);
		
//LiknkedHashSet guarantee insertion order
		Set<String>fruits=new LinkedHashSet<>();
		fruits.add("mango");
		fruits.add("apple");
		fruits.add("kiwi");
		fruits.add("banana");
		fruits.add("mango");
		fruits.add("tomatoe");
		
		System.out.println(fruits);
		System.out.println("*********");
	//tree set stores objects in ascending order
		Set<String>food=new TreeSet<>(); //string yerine object te yazilabilir cunku every obj is child of object class
		food.addAll(veggies);
		food.addAll(fruits);
		
          System.out.println(food);
	}

}
