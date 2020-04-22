package oops;

public class MethodsReturn {
// create a method that will accept array of int and return max element from thata array
	
	int getLargestNumber(int [] array) {
	int largest=array[0];
	for(int i=1;i<array.length;i++) {
		if (array[i]>largest) {
			largest=array[i];
	 }
	}
	return largest;
  }	
//create a method that will accept a string & return each word from a string
String[]  getWordsFromString(String str) {
String[] array=str.split(" ");
return array;
}
public static void main(String[]args) {
 MethodsReturn o=new MethodsReturn();
 int [] arr= {10,20,30};
 System.out.println(o.getLargestNumber(arr));

 String MyString="It is a beautiful world";
 String[] words=o.getWordsFromString(MyString);
 for(String word:words) {
	 System.out.print(word+ " ");
 }

}
}





